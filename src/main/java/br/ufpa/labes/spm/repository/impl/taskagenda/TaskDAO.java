package br.ufpa.labes.spm.repository.impl.taskagenda;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Query;

import br.ufpa.labes.spm.repository.impl.BaseDAO;
import br.ufpa.labes.spm.repository.interfaces.taskagenda.ITaskDAO;
import br.ufpa.labes.spm.service.dto.dashboard.Time;
import br.ufpa.labes.spm.domain.AgendaEvent;
import br.ufpa.labes.spm.domain.Task;
import br.ufpa.labes.spm.util.ServicesUtil;

public class TaskDAO extends BaseDAO<Task, Long> implements ITaskDAO {

  protected TaskDAO(Class<Task> businessClass) {
    super(businessClass);
  }

  public TaskDAO() {
    super(Task.class);
  }

  @Override
  public float getWorkingHoursForTask(String normalIdent, String agentIdent) {
    AgendaEvent[] event = this.getAgendaEventsForTask(normalIdent, agentIdent);

    if (event == null) return 0.0f;

    float totalElapsedTime = 0.0f;

    boolean isCounting = false;

    long startTimeMillis = -1;
    long endTimeMillis = -1;
    long elapsedTime = -1;

    for (int i = 0; i < event.length; i++) {
      if (event[i].getTheCatalogEvent().getDescription().equals("ToActive")) {
        isCounting = true;

        startTimeMillis = event[i].getWhen().toEpochDay();
      } else if (event[i].getTheCatalogEvent().getDescription().equals("ToFinished")
          || event[i].getTheCatalogEvent().getDescription().equals("ToPaused")
          || event[i].getTheCatalogEvent().getDescription().equals("ToFailed")) {
        isCounting = false;

        if (startTimeMillis != -1) {
          endTimeMillis = event[i].getWhen().toEpochDay();

          elapsedTime = endTimeMillis - startTimeMillis;

          totalElapsedTime += ((float) elapsedTime / (1000 * 60 * 60));
        }
      }
      //			System.out.println("Normal: " + normalIdent + " --> contando: " + isCounting);
    }

    if (isCounting) {
      endTimeMillis = LocalDate.now().toEpochDay();

      elapsedTime = endTimeMillis - startTimeMillis;

      totalElapsedTime += ((float) elapsedTime / (1000 * 60 * 60));
    }

    //		System.out.println("Normal: " + normalIdent + " --> tempo: " + totalElapsedTime);
    return totalElapsedTime;
  }

  @Override
  public Time getWorkingHoursForTask2(String normalIdent, String agentIdent) {
    //		System.out.println("----------------------------------------------------");
    //		System.out.println(normalIdent);
    AgendaEvent[] event = this.getAgendaEventsForTask(normalIdent, agentIdent);

    Time horaInicial = new Time(0, 0);
    LocalDate startDate = null;
    LocalDate endDate = null;

    if (event == null) {
      return horaInicial;
    }

    int segundos = 0;
    //		hours = totalSecs / 3600;
    //		minutes = (totalSecs % 3600) / 60;

    boolean isCounting = false;

    long startTimeMillis = -1;
    long endTimeMillis = -1;
    long elapsedTime = -1;

    for (int i = (event.length - 1); i >= 0; i--) {
      if (event[i].getTheCatalogEvent().getDescription().equals("ToActive")) {
        isCounting = true;

        startTimeMillis = event[i].getWhen().toEpochDay();
        startDate = event[i].getWhen();
        //				System.out.println("--------> Start: " + event[i].getWhen());
      } else if (event[i].getTheCatalogEvent().getDescription().equals("ToFinished")
          || event[i].getTheCatalogEvent().getDescription().equals("ToPaused")
          || event[i].getTheCatalogEvent().getDescription().equals("ToFailed")) {
        isCounting = false;
        //				System.out.println("Event: " + event[i].getTheCatalogEvents().getDescription());

        if (startTimeMillis != -1) {
          endTimeMillis = event[i].getWhen().toEpochDay();
          endDate = event[i].getWhen();

          elapsedTime = endTimeMillis - startTimeMillis;

          segundos += ServicesUtil.segundosEntre(Date.valueOf(startDate), Date.valueOf(endDate));

          //					System.out.println("--------> End: " + event[i].getWhen());
          //					System.out.println("--------> Segundos: " + segundos + "; Horas:" + (segundos /
          // 3600) + "; Minutos: " + ((segundos % 3600) / 60));
          //					totalElapsedTime += ((float) elapsedTime / (1000 * 60 * 60));
        }
      }
      //			System.out.println("Normal: " + normalIdent + " --> contando: " + isCounting);
    }

    if (isCounting) {
      endTimeMillis = LocalDate.now().toEpochDay();
      elapsedTime = endTimeMillis - startTimeMillis;

      segundos +=
          ServicesUtil.segundosEntre(Date.valueOf(startDate), Date.valueOf(LocalDate.now()));
      //			System.out.println("--------> No End: " + LocalDate.now());
      //			System.out.println("--------> Segundos: " + segundos + "; Horas:" + (segundos / 3600) +
      // "; Minutos: " + ((segundos % 3600) / 60));
      //			totalElapsedTime += ((float) elapsedTime / (1000 * 60 * 60));
    }

    //		System.out.println("----------------------------------------------------");
    int minutos = ServicesUtil.minutosEmSegundos(segundos);
    int horas = ServicesUtil.horasEmSegundos(segundos);
    return new Time(horas, minutos);
  }

  public AgendaEvent[] getAgendaEventsForTask(String normalIdent, String agentIdent) {
    String hql =
        "from "
            + AgendaEvent.class.getName()
            + " event "
            + "where ( event.theTask.theProcessAgenda.theTaskAgenda.theAgent.ident=:agentID ) "
            + "and ( event.theTask.theNormal.ident=:normalID ) order by event.oid";

    Query query = this.getPersistenceContext().createQuery(hql);

    query.setParameter("agentID", agentIdent);
    query.setParameter("normalID", normalIdent);

    List<AgendaEvent> list = query.getResultList();

    AgendaEvent[] result = new AgendaEvent[list.size()];

    result = list.toArray(result);

    return result;
  }

  private int corrigirTempo(int tempo) {
    if (tempo < 0) {
      tempo = (-1) * tempo;
    }
    return tempo;
  }
}
