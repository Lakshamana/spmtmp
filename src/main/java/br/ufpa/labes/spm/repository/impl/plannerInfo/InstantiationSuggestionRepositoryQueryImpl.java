package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.InstantiationSuggestionRepositoryQuery;
import br.ufpa.labes.spm.domain.InstantiationSuggestion;

public class InstantiationSuggestionRepositoryQueryImpl extends BaseRepositoryQueryImpl<InstantiationSuggestion, Long>
    implements nstantiationSuggestionRepositoryQuery{

  protected InstantiationSuggestionRepositoryQueryImpl(Class<InstantiationSuggestion> businessClass) {
    super(businessClass);
  }

  public InstantiationSuggestionRepositoryQueryImpl() {
    super(InstantiationSuggestion.class);
  }
}
