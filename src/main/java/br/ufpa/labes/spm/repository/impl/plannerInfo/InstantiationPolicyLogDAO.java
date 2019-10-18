package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IInstantiationPolicyLogDAO;
import br.ufpa.labes.spm.domain.InstantiationPolicyLog;

public class InstantiationPolicyLogDAO extends BaseRepositoryQueryImpl<InstantiationPolicyLog, Long>
    implements IInstantiationPolicyLogDAO {

  protected InstantiationPolicyLogDAO(Class<InstantiationPolicyLog> businessClass) {
    super(businessClass);
  }

  public InstantiationPolicyLogDAO() {
    super(InstantiationPolicyLog.class);
  }
}
