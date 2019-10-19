package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.PeopleInstantiationSuggestionRepositoryQuery;
import br.ufpa.labes.spm.domain.PeopleInstSug;

public class PeopleInstantiationSuggestionRepositoryQueryImpl extends BaseRepositoryQueryImpl<PeopleInstSug, Long>
    implements PeopleInstantiationSuggestionRepositoryQuery{

  protected PeopleInstantiationSuggestionRepositoryQueryImpl(Class<PeopleInstSug> businessClass) {
    super(businessClass);
  }

  public PeopleInstantiationSuggestionRepositoryQueryImpl() {
    super(PeopleInstSug.class);
  }
}
