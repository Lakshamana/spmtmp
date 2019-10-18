package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IProcessEventRepositoryQuery;
import br.ufpa.labes.spm.domain.ProcessEvent;

public class ProcessEventRepositoryQuery extends BaseRepositoryQueryImpl<ProcessEvent, Long> implements IProcessEventRepositoryQuery {

  protected ProcessEventRepositoryQuery(Class<ProcessEvent> businessClass) {
    super(businessClass);
  }

  public ProcessEventRepositoryQuery() {
    super(ProcessEvent.class);
  }
}
