package br.ufpa.labes.spm.repository.impl.taskagenda;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.taskagenda.ITaskAgendaRepositoryQuery;
import br.ufpa.labes.spm.domain.TaskAgenda;

public class TaskAgendaRepositoryQueryImpl extends BaseRepositoryQueryImpl<TaskAgenda, Long> implements ITaskAgendaRepositoryQuery {

  protected TaskAgendaRepositoryQueryImpl(Class<TaskAgenda> businessClass) {
    super(businessClass);
  }

  public TaskAgendaRepositoryQueryImpl() {
    super(TaskAgenda.class);
  }
}
