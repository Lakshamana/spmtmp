package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IAgentHasAbilityRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentHasAbility;

public class AgentHasAbilityRepositoryQuery extends BaseRepositoryQueryImpl<AgentHasAbility, Long>
    implements IAgentHasAbilityRepositoryQuery {

  protected AgentHasAbilityRepositoryQuery(Class<AgentHasAbility> businessClass) {
    super(businessClass);
  }

  public AgentHasAbilityRepositoryQuery() {
    super(AgentHasAbility.class);
  }
}
