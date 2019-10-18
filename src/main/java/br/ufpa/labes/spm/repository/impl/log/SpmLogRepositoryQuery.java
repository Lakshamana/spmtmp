package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.ISpmLogRepositoryQuery;
import br.ufpa.labes.spm.domain.SpmLog;

public class SpmLogRepositoryQuery extends BaseRepositoryQueryImpl<SpmLog, Long> implements ISpmLogRepositoryQuery {

  protected SpmLogRepositoryQuery(Class<SpmLog> businessClass) {
    super(businessClass);
  }

  public SpmLogRepositoryQuery() {
    super(SpmLog.class);
  }
}
