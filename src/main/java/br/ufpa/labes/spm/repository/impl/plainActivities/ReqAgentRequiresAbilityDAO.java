package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IReqAgentRequiresAbilityDAO;
import br.ufpa.labes.spm.domain.ReqAgentRequiresAbility;

public class ReqAgentRequiresAbilityDAO extends BaseRepositoryQueryImpl<ReqAgentRequiresAbility, Long>
    implements IReqAgentRequiresAbilityDAO {

  protected ReqAgentRequiresAbilityDAO(Class<ReqAgentRequiresAbility> businessClass) {
    super(businessClass);
  }

  public ReqAgentRequiresAbilityDAO() {
    super(ReqAgentRequiresAbility.class);
  }
}
