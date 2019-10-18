package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IProcessModelEventDAO;
import br.ufpa.labes.spm.domain.ProcessModelEvent;

public class ProcessModelEventDAO extends BaseRepositoryQueryImpl<ProcessModelEvent, Long>
    implements IProcessModelEventDAO {

  protected ProcessModelEventDAO(Class<ProcessModelEvent> businessClass) {
    super(businessClass);
  }

  public ProcessModelEventDAO() {
    super(ProcessModelEvent.class);
  }
}
