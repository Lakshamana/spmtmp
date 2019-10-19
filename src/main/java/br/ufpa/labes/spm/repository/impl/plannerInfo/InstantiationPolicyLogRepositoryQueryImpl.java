package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IInstantiationPolicyLogRepositoryQuery;
import br.ufpa.labes.spm.domain.InstantiationPolicyLog;

public class InstantiationPolicyLogRepositoryQueryImpl extends BaseRepositoryQueryImpl<InstantiationPolicyLog, Long>
    implements IInstantiationPolicyLogRepositoryQuery {

  protected InstantiationPolicyLogRepositoryQueryImpl(Class<InstantiationPolicyLog> businessClass) {
    super(businessClass);
  }

  public InstantiationPolicyLogRepositoryQueryImpl() {
    super(InstantiationPolicyLog.class);
  }
}
