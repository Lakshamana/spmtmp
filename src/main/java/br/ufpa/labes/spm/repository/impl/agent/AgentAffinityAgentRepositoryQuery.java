package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IAgentAffinityAgentRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentAffinityAgent;

public class AgentAffinityAgentRepositoryQuery extends BaseRepositoryQueryImpl<AgentAffinityAgent, Long>
    implements IAgentAffinityAgentRepositoryQuery {

  protected AgentAffinityAgentRepositoryQuery(Class<AgentAffinityAgent> businessClass) {
    super(businessClass);
  }

  public AgentAffinityAgentRepositoryQuery() {
    super(AgentAffinityAgent.class);
  }
}
