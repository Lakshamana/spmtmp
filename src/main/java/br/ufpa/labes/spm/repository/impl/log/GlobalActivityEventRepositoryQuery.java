package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IGlobalActivityEventRepositoryQuery;
import br.ufpa.labes.spm.domain.GlobalActivityEvent;

public class GlobalActivityEventRepositoryQuery extends BaseRepositoryQueryImpl<GlobalActivityEvent, Long>
    implements IGlobalActivityEventRepositoryQuery {

  protected GlobalActivityEventRepositoryQuery(Class<GlobalActivityEvent> businessClass) {
    super(businessClass);
  }

  public GlobalActivityEventRepositoryQuery() {
    super(GlobalActivityEvent.class);
  }
}
