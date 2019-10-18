package br.ufpa.labes.spm.repository.impl.taskagenda;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.taskagenda.ITaskAgendaRepositoryQuery;
import br.ufpa.labes.spm.domain.TaskAgenda;

public class TaskAgendaRepositoryQuery extends BaseRepositoryQueryImpl<TaskAgenda, Long> implements ITaskAgendaRepositoryQuery {

  protected TaskAgendaRepositoryQuery(Class<TaskAgenda> businessClass) {
    super(businessClass);
  }

  public TaskAgendaRepositoryQuery() {
    super(TaskAgenda.class);
  }
}
