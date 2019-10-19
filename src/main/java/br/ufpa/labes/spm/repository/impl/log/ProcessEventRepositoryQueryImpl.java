package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IProcessEventRepositoryQuery;
import br.ufpa.labes.spm.domain.ProcessEvent;

public class ProcessEventRepositoryQueryImpl extends BaseRepositoryQueryImpl<ProcessEvent, Long> implements IProcessEventRepositoryQuery {

  protected ProcessEventRepositoryQueryImpl(Class<ProcessEvent> businessClass) {
    super(businessClass);
  }

  public ProcessEventRepositoryQueryImpl() {
    super(ProcessEvent.class);
  }
}
