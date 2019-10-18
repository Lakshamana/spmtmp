package br.ufpa.labes.spm.repository.impl.taskagenda;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.taskagenda.ITaskAgendaDAO;
import br.ufpa.labes.spm.domain.TaskAgenda;

public class TaskAgendaDAO extends BaseRepositoryQueryImpl<TaskAgenda, Long> implements ITaskAgendaDAO {

  protected TaskAgendaDAO(Class<TaskAgenda> businessClass) {
    super(businessClass);
  }

  public TaskAgendaDAO() {
    super(TaskAgenda.class);
  }
}
