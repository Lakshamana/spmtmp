package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.SpmLogRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.SpmLog;

public class SpmLogRepositoryQueryImpl implements SpmLogRepositoryQuery {

  protected SpmLogRepositoryQueryImpl(Class<SpmLog> businessClass) {
    super(businessClass);
  }

  public SpmLogRepositoryQueryImpl() {
    super(SpmLog.class);
  }
}
