package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IReqAgentRequiresAbilityRepositoryQuery;
import br.ufpa.labes.spm.domain.ReqAgentRequiresAbility;

public class ReqAgentRequiresAbilityRepositoryQueryImpl extends BaseRepositoryQueryImpl<ReqAgentRequiresAbility, Long>
    implements IReqAgentRequiresAbilityRepositoryQuery {

  protected ReqAgentRequiresAbilityRepositoryQueryImpl(Class<ReqAgentRequiresAbility> businessClass) {
    super(businessClass);
  }

  public ReqAgentRequiresAbilityRepositoryQueryImpl() {
    super(ReqAgentRequiresAbility.class);
  }
}