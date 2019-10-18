package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IInstantiationSuggestionRepositoryQuery;
import br.ufpa.labes.spm.domain.InstantiationSuggestion;

public class InstantiationSuggestionRepositoryQuery extends BaseRepositoryQueryImpl<InstantiationSuggestion, Long>
    implements IInstantiationSuggestionRepositoryQuery {

  protected InstantiationSuggestionRepositoryQuery(Class<InstantiationSuggestion> businessClass) {
    super(businessClass);
  }

  public InstantiationSuggestionRepositoryQuery() {
    super(InstantiationSuggestion.class);
  }
}
