package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.AgentInstSuggestionToAgentRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentInstSuggestionToAgent;

public class AgentInstSuggestionToAgentRepositoryQueryImpl extends BaseRepositoryQueryImpl<AgentInstSuggestionToAgent, Long>
    implements AgentInstSuggestionToAgentRepositoryQuery{

  protected AgentInstSuggestionToAgentRepositoryQueryImpl(Class<AgentInstSuggestionToAgent> businessClass) {
    super(businessClass);
  }

  public AgentInstSuggestionToAgentRepositoryQueryImpl() {
    super(AgentInstSuggestionToAgent.class);
  }
}
