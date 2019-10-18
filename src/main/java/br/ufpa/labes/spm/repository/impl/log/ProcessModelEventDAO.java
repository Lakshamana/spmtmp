package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IProcessModelEventDAO;
import br.ufpa.labes.spm.domain.ProcessModelEvent;

public class ProcessModelEventDAO extends BaseDAOImpl<ProcessModelEvent, Long>
    implements IProcessModelEventDAO {

  protected ProcessModelEventDAO(Class<ProcessModelEvent> businessClass) {
    super(businessClass);
  }

  public ProcessModelEventDAO() {
    super(ProcessModelEvent.class);
  }
}
