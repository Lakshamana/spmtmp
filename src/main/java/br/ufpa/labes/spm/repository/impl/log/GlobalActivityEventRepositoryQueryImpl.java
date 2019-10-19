package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IGlobalActivityEventRepositoryQuery;
import br.ufpa.labes.spm.domain.GlobalActivityEvent;

public class GlobalActivityEventRepositoryQueryImpl extends BaseRepositoryQueryImpl<GlobalActivityEvent, Long>
    implements IGlobalActivityEventRepositoryQuery {

  protected GlobalActivityEventRepositoryQueryImpl(Class<GlobalActivityEvent> businessClass) {
    super(businessClass);
  }

  public GlobalActivityEventRepositoryQueryImpl() {
    super(GlobalActivityEvent.class);
  }
}
