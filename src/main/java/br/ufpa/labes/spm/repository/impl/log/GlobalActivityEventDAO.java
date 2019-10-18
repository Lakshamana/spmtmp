package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IGlobalActivityEventDAO;
import br.ufpa.labes.spm.domain.GlobalActivityEvent;

public class GlobalActivityEventDAO extends BaseRepositoryQueryImpl<GlobalActivityEvent, Long>
    implements IGlobalActivityEventDAO {

  protected GlobalActivityEventDAO(Class<GlobalActivityEvent> businessClass) {
    super(businessClass);
  }

  public GlobalActivityEventDAO() {
    super(GlobalActivityEvent.class);
  }
}
