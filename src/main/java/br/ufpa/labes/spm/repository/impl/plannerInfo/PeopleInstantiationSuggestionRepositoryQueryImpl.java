package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IPeopleInstantiationSuggestionRepositoryQuery;
import br.ufpa.labes.spm.domain.PeopleInstSug;

public class PeopleInstantiationSuggestionRepositoryQueryImpl extends BaseRepositoryQueryImpl<PeopleInstSug, Long>
    implements IPeopleInstantiationSuggestionRepositoryQuery {

  protected PeopleInstantiationSuggestionRepositoryQueryImpl(Class<PeopleInstSug> businessClass) {
    super(businessClass);
  }

  public PeopleInstantiationSuggestionRepositoryQueryImpl() {
    super(PeopleInstSug.class);
  }
}
