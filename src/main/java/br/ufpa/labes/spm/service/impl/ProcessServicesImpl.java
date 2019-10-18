package br.ufpa.labes.spm.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufpa.labes.spm.converter.Converter;
import br.ufpa.labes.spm.converter.ConverterImpl;
import br.ufpa.labes.spm.exceptions.ImplementationException;
import br.ufpa.labes.spm.repository.AgentRepository;
import br.ufpa.labes.spm.repository.ProcessRepository;
import br.ufpa.labes.spm.service.dto.ActivityDTO;
import br.ufpa.labes.spm.service.dto.ActivitysDTO;
import br.ufpa.labes.spm.service.dto.DecomposedDTO;
import br.ufpa.labes.spm.service.dto.ProjectDTO;
import br.ufpa.labes.spm.service.dto.ProjectsDTO;
import br.ufpa.labes.spm.service.dto.ProcessDTO;
import br.ufpa.labes.spm.service.dto.ProcessesDTO;
import br.ufpa.labes.spm.domain.Activity;
import br.ufpa.labes.spm.domain.Decomposed;
import br.ufpa.labes.spm.domain.Agent;
import br.ufpa.labes.spm.domain.Project;
import br.ufpa.labes.spm.domain.Process;
import br.ufpa.labes.spm.domain.ProcessModel;
import br.ufpa.labes.spm.domain.ProcessAgenda;
import br.ufpa.labes.spm.domain.Task;
import br.ufpa.labes.spm.service.interfaces.ProcessServices;

@Service
@Transactional
public class ProcessServicesImpl implements ProcessServices {

	private static final String PROCESSAGENDA_CLASSNAME = ProcessAgenda.class.getName();
	private static final String PROJECT_CLASSNAME = Project.class.getName();
  private static final String PROCESS_CLASSNAME = Process.class.getSimpleName();

  @Autowired
	private ProcessRepository processRepository;

  @Autowired
	private AgentRepository agentRepository;

  private Query query;

  private Converter converter = new ConverterImpl();

	@Override
	public ProjectsDTO getProjectsForAgent(String agentIdent) {
		String hql_project = "SELECT pr FROM " + PROJECT_CLASSNAME + " as pr " +
		                     "WHERE pr.processRefered in (SELECT procAg.theProcess FROM "+
		                     PROCESSAGENDA_CLASSNAME +" as procAg WHERE procAg.theTaskAgenda.theAgent.ident =:agentId )";

		query = processRepository.getPersistenceContext().createQuery(hql_project);
		query.setParameter( "agentId", agentIdent );
		List<Project> projectList = query.getResultList();

//		System.out.println("Agent: " + agentIdent);
//		System.out.println("------------- Projetos ------------");
//		for (Project project : projectList) {
//			System.out.println("Name: " + project.getName());
//		}
//		System.out.println("-----------------------------------");

		ProjectsDTO projects = this.convertProjectsToProjectsDTO(projectList);
		return projects;
	}

	@Override
	public ProcessesDTO getProjectsManagedBy(String agentIdent) {
		System.out.println("ident"+ agentIdent);


		String hql_processes_with_manager = "select p from " + PROCESS_CLASSNAME + " as p left join p.theAgent ag " +
	            " where ag.ident = :identAgent";


		query = processRepository.getPersistenceContext().createQuery(hql_processes_with_manager);
		query.setParameter( "identAgent", agentIdent );
		@SuppressWarnings("unchecked")
		List<Process> processList = query.getResultList();
		System.out.println("caiu no get manager"+ processList);
			ProcessesDTO processes = this.convertProcessToProcessDTO(processList);

		return processes;
	}



	@Override
	public List<ProcessDTO> getProcess(String agentIdent) {
		String hql = "SELECT distinct proc FROM " + PROCESSAGENDA_CLASSNAME + " AS proc WHERE proc.theTaskAgenda.theAgent.ident <> :ident";
		query = agentRepository.getPersistenceContext().createQuery(hql);
		query.setParameter("ident", agentIdent);
		List<ProcessAgenda> procs = query.getResultList();
		List<ProcessDTO> processes = new ArrayList<ProcessDTO>();

		for (ProcessAgenda processAgenda : procs) {
			ProcessDTO processDTO = new ProcessDTO(processAgenda.getTheProcess().getIdent(), processAgenda.getTheProcess().getpState(), this.getTasksFromProcess(processAgenda));
			processDTO.setTasksIdents(this.getTasksIdentsFromProcess(processAgenda));
			if(processes.contains(processDTO)) {
				int index = processes.indexOf(processDTO);
				processes.get(index).getTasks().addAll(processDTO.getTasks());
				processes.get(index).getTasksIdents().addAll(processDTO.getTasksIdents());
			} else {
				Process process = processAgenda.getTheProcess();
				if(!isProcessFinished(process)) processes.add(processDTO);
			}
		}
		System.out.println("acabou o método");
		return processes;
	}

	private boolean isProcessFinished(Process process) {
		return process.getpState().equals(Process.FINISHED);
	}

	@Override
	public ActivitysDTO getActivitiesFromProcess(String processIdent) {
		Process process = processRepository
				.retrieveBySecondaryKey(processIdent);
		Collection<Activity> result = null;
		if(process != null && process.getTheProcessModel() != null) {
			ProcessModel model = process.getTheProcessModel();
			result = model.getTheActivities();
		} else {
			result = new ArrayList<Activity>();
		}

		List<ActivityDTO> activities = new ArrayList<ActivityDTO>();
		Collection<Activity> normals = new ArrayList<Activity>();

		for (Activity activity : result) {
			if(activity instanceof Decomposed) {
				Decomposed decomposed = (Decomposed) activity;
				DecomposedDTO decomposedDTO = this.convertDecomposedToDecomposedDTO(decomposed);
				activities.add(decomposedDTO);
			} else {
				normals.add(activity);
			}
		}

		for (Activity activity : normals) {
			if(activity instanceof Decomposed) {
				Decomposed childDecomposed = (Decomposed) activity;
				DecomposedDTO decomposedDTO = this.convertDecomposedToDecomposedDTO(childDecomposed);
				activities.add(decomposedDTO);
			} else {
//				ActivityDTO activityDTO = this.convertActivityToActivityDTO(activity);
//				activities.add(activityDTO);
			}
		}
//		System.out.println("Lista: " + activities);
		ActivitysDTO activitysDTO = new ActivitysDTO(activities);
		return activitysDTO;
	}

	private ActivityDTO convertActivityToActivityDTO(Activity activity) {
		ActivityDTO act = new ActivityDTO(activity.getName(), activity.getIdent(), "", 0.0, new Date(), new Date());
		return act;
	}

	private DecomposedDTO convertDecomposedToDecomposedDTO(Decomposed activity) {
		DecomposedDTO decomposed = new DecomposedDTO();
		List<ActivityDTO> activities = new ArrayList<ActivityDTO>();
		decomposed.setName(activity.getName());
		decomposed.setIdent(activity.getIdent());
		for (Activity a : activity.getTheReferedProcessModel().getTheActivities()) {
			if(a instanceof Decomposed) {
				Decomposed dd = (Decomposed) a;
				DecomposedDTO decomposedDTO = this.convertDecomposedToDecomposedDTO(dd);
				decomposed.setDecomposed(decomposedDTO);
			}
			activities.add(this.convertActivityToActivityDTO(a));
		}
		ActivitysDTO acts = new ActivitysDTO(activities);
		decomposed.setNormals(acts);

//		System.out.println("D: " + decomposed.getIdent());
		return decomposed;
	}

	private List<String> getTasksFromProcess(ProcessAgenda processAgenda) {
		List<String> tasks = new ArrayList<String>();
		for (Task task : processAgenda.getTheTasks()) {
//			if(task.getLocalState() == Plain.WAITING)
				tasks.add(task.getTheNormal().getName());
		}

		return tasks;
	}

	private List<String> getTasksIdentsFromProcess(ProcessAgenda processAgenda) {
		List<String> tasks = new ArrayList<String>();
		for (Task task : processAgenda.getTheTasks()) {
				tasks.add(task.getTheNormal().getIdent());
		}
		return tasks;
	}

	private ProjectsDTO convertProjectsToProjectsDTO(List<Project> projects) {
		ProjectsDTO projectsDTO = new ProjectsDTO(new ArrayList<ProjectDTO>());
		for (Project project : projects) {
			ProjectDTO projectDTO = this.convertProjectToProjectDTO(project);
			projectsDTO.addProject(projectDTO);
		}

		return projectsDTO;
	}

	private ProcessesDTO convertProcessToProcessDTO(List<Process> processes) {
		ProcessesDTO processDTO = new ProcessesDTO(new ArrayList<ProcessDTO>());
		for (Process process : processes) {
			ProcessDTO projectDTO = this.convertProcessToProcessDTO(process);
			processDTO.addProcess(projectDTO);
		}

		return processDTO;
	}



	private ProjectDTO convertProjectToProjectDTO(Project project) {
		try {
			ProjectDTO projectDTO = new ProjectDTO();
			projectDTO = (ProjectDTO) converter.getDTO(project, ProjectDTO.class);
			if(project.getProcessRefered() != null) {
				projectDTO.setProcessRefered(project.getProcessRefered().getIdent());
				projectDTO.setpState(project.getProcessRefered().getpState());
				List<Agent> agents = (List<Agent>) project.getProcessRefered().getTheAgents();

				List<String> agentNames = getAgentNames(agents);
				projectDTO.setAgents(agentNames);
			} else {
				projectDTO.setpState(Process.NOT_STARTED);
			}

			return projectDTO;
		} catch (ImplementationException e) {
			e.printStackTrace();
		}

		return null;
	}


	private ProcessDTO convertProcessToProcessDTO(Process process) {
		try {
			ProcessDTO processDTO = new ProcessDTO();
			processDTO = (ProcessDTO) converter.getDTO(process, ProcessDTO.class);


			return processDTO;
		} catch (ImplementationException e) {
			e.printStackTrace();
		}

		return null;
	}


	private List<String> getAgentNames(List<Agent> agents) {
		List<String> agentNames = new ArrayList<String>();
		for (Agent agent : agents) {
			agentNames.add(agent.getName());
		}
		return agentNames;
	}


}
