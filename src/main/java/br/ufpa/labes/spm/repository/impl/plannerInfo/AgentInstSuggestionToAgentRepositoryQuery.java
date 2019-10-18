package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IAgentInstSuggestionToAgentRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentInstSuggestionToAgent;

public class AgentInstSuggestionToAgentRepositoryQuery extends BaseRepositoryQueryImpl<AgentInstSuggestionToAgent, Long>
    implements IAgentInstSuggestionToAgentRepositoryQuery {

  protected AgentInstSuggestionToAgentRepositoryQuery(Class<AgentInstSuggestionToAgent> businessClass) {
    super(businessClass);
  }

  public AgentInstSuggestionToAgentRepositoryQuery() {
    super(AgentInstSuggestionToAgent.class);
  }
}
