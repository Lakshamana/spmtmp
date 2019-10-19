package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.ISpmLogRepositoryQuery;
import br.ufpa.labes.spm.domain.SpmLog;

public class SpmLogRepositoryQueryImpl extends BaseRepositoryQueryImpl<SpmLog, Long> implements ISpmLogRepositoryQuery {

  protected SpmLogRepositoryQueryImpl(Class<SpmLog> businessClass) {
    super(businessClass);
  }

  public SpmLogRepositoryQueryImpl() {
    super(SpmLog.class);
  }
}
