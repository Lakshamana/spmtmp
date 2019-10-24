package br.ufpa.labes.spm.repository.impl.taskagenda;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.taskagenda.TaskAgendaRepositoryQuery;
import br.ufpa.labes.spm.domain.TaskAgenda;

public class TaskAgendaRepositoryQueryImpl implements TaskAgendaRepositoryQuery{

  protected TaskAgendaRepositoryQueryImpl(Class<TaskAgenda> businessClass) {
    super(businessClass);
  }

  public TaskAgendaRepositoryQueryImpl() {
    super(TaskAgenda.class);
  }
}
