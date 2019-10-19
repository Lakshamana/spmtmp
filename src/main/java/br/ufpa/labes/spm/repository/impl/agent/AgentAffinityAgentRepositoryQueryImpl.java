package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.AgentAffinityAgentRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentAffinityAgent;

public class AgentAffinityAgentRepositoryQueryImpl extends BaseRepositoryQueryImpl<AgentAffinityAgent, Long>
    implements AgentAffinityAgentRepositoryQuery{

  protected AgentAffinityAgentRepositoryQueryImpl(Class<AgentAffinityAgent> businessClass) {
    super(businessClass);
  }

  public AgentAffinityAgentRepositoryQueryImpl() {
    super(AgentAffinityAgent.class);
  }
}
