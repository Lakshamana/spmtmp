package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IInstantiationPolicyLogRepositoryQuery;
import br.ufpa.labes.spm.domain.InstantiationPolicyLog;

public class InstantiationPolicyLogRepositoryQuery extends BaseRepositoryQueryImpl<InstantiationPolicyLog, Long>
    implements IInstantiationPolicyLogRepositoryQuery {

  protected InstantiationPolicyLogRepositoryQuery(Class<InstantiationPolicyLog> businessClass) {
    super(businessClass);
  }

  public InstantiationPolicyLogRepositoryQuery() {
    super(InstantiationPolicyLog.class);
  }
}
