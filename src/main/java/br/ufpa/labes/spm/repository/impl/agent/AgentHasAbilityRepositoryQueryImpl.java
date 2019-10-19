package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IAgentHasAbilityRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentHasAbility;

public class AgentHasAbilityRepositoryQueryImpl extends BaseRepositoryQueryImpl<AgentHasAbility, Long>
    implements IAgentHasAbilityRepositoryQuery {

  protected AgentHasAbilityRepositoryQueryImpl(Class<AgentHasAbility> businessClass) {
    super(businessClass);
  }

  public AgentHasAbilityRepositoryQueryImpl() {
    super(AgentHasAbility.class);
  }
}
