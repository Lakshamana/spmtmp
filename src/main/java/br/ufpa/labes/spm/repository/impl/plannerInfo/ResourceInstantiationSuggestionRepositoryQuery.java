package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IResourceInstantiationSuggestionRepositoryQuery;
import br.ufpa.labes.spm.domain.ResourceInstSug;

public class ResourceInstantiationSuggestionRepositoryQuery extends BaseRepositoryQueryImpl<ResourceInstSug, Long>
    implements IResourceInstantiationSuggestionRepositoryQuery {

  protected ResourceInstantiationSuggestionRepositoryQuery(Class<ResourceInstSug> businessClass) {
    super(businessClass);
  }

  public ResourceInstantiationSuggestionRepositoryQuery() {
    super(ResourceInstSug.class);
  }
}
