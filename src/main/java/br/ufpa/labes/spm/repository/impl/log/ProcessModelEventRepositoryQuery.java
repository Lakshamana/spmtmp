package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IProcessModelEventRepositoryQuery;
import br.ufpa.labes.spm.domain.ProcessModelEvent;

public class ProcessModelEventRepositoryQuery extends BaseRepositoryQueryImpl<ProcessModelEvent, Long>
    implements IProcessModelEventRepositoryQuery {

  protected ProcessModelEventRepositoryQuery(Class<ProcessModelEvent> businessClass) {
    super(businessClass);
  }

  public ProcessModelEventRepositoryQuery() {
    super(ProcessModelEvent.class);
  }
}
