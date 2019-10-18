package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IPeopleInstantiationSuggestionRepositoryQuery;
import br.ufpa.labes.spm.domain.PeopleInstSug;

public class PeopleInstantiationSuggestionRepositoryQuery extends BaseRepositoryQueryImpl<PeopleInstSug, Long>
    implements IPeopleInstantiationSuggestionRepositoryQuery {

  protected PeopleInstantiationSuggestionRepositoryQuery(Class<PeopleInstSug> businessClass) {
    super(businessClass);
  }

  public PeopleInstantiationSuggestionRepositoryQuery() {
    super(PeopleInstSug.class);
  }
}
