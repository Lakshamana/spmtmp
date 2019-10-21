package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.AgentInstantiationSuggestionRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentInstSug;

public class AgentInstantiationSuggestionRepositoryQueryImpl extends BaseRepositoryQueryImpl<AgentInstSug, Long>
    implements AgentInstantiationSuggestionRepositoryQuery{

  protected AgentInstantiationSuggestionRepositoryQueryImpl(Class<AgentInstSug> businessClass) {
    super(businessClass);
  }

  public AgentInstantiationSuggestionRepositoryQueryImpl() {
    super(AgentInstSug.class);
  }
}
