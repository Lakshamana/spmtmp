package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IProcessEventDAO;
import br.ufpa.labes.spm.domain.ProcessEvent;

public class ProcessEventDAO extends BaseDAOImpl<ProcessEvent, Long> implements IProcessEventDAO {

  protected ProcessEventDAO(Class<ProcessEvent> businessClass) {
    super(businessClass);
  }

  public ProcessEventDAO() {
    super(ProcessEvent.class);
  }
}
