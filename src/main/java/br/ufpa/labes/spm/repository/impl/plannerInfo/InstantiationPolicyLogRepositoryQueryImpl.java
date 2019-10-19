package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.InstantiationPolicyLogRepositoryQuery;
import br.ufpa.labes.spm.domain.InstantiationPolicyLog;

public class InstantiationPolicyLogRepositoryQueryImpl extends BaseRepositoryQueryImpl<InstantiationPolicyLog, Long>
    implements InstantiationPolicyLogRepositoryQuery{

  protected InstantiationPolicyLogRepositoryQueryImpl(Class<InstantiationPolicyLog> businessClass) {
    super(businessClass);
  }

  public InstantiationPolicyLogRepositoryQueryImpl() {
    super(InstantiationPolicyLog.class);
  }
}
