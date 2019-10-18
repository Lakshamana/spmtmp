package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IReqAgentRequiresAbilityRepositoryQuery;
import br.ufpa.labes.spm.domain.ReqAgentRequiresAbility;

public class ReqAgentRequiresAbilityRepositoryQuery extends BaseRepositoryQueryImpl<ReqAgentRequiresAbility, Long>
    implements IReqAgentRequiresAbilityRepositoryQuery {

  protected ReqAgentRequiresAbilityRepositoryQuery(Class<ReqAgentRequiresAbility> businessClass) {
    super(businessClass);
  }

  public ReqAgentRequiresAbilityRepositoryQuery() {
    super(ReqAgentRequiresAbility.class);
  }
}
