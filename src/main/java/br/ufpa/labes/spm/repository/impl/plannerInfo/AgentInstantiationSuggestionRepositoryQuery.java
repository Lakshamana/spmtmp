package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IAgentInstantiationSuggestionRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentInstSug;

public class AgentInstantiationSuggestionRepositoryQuery extends BaseRepositoryQueryImpl<AgentInstSug, Long>
    implements IAgentInstantiationSuggestionRepositoryQuery {

  protected AgentInstantiationSuggestionRepositoryQuery(Class<AgentInstSug> businessClass) {
    super(businessClass);
  }

  public AgentInstantiationSuggestionRepositoryQuery() {
    super(AgentInstSug.class);
  }
}
