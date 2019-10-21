package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.AgentHasAbilityRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentHasAbility;

public class AgentHasAbilityRepositoryQueryImpl extends BaseRepositoryQueryImpl<AgentHasAbility, Long>
    implements AgentHasAbilityRepositoryQuery{

  protected AgentHasAbilityRepositoryQueryImpl(Class<AgentHasAbility> businessClass) {
    super(businessClass);
  }

  public AgentHasAbilityRepositoryQueryImpl() {
    super(AgentHasAbility.class);
  }
}
