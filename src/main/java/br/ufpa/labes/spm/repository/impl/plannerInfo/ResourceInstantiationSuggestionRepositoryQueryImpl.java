package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IResourceInstantiationSuggestionRepositoryQuery;
import br.ufpa.labes.spm.domain.ResourceInstSug;

public class ResourceInstantiationSuggestionRepositoryQueryImpl extends BaseRepositoryQueryImpl<ResourceInstSug, Long>
    implements IResourceInstantiationSuggestionRepositoryQuery {

  protected ResourceInstantiationSuggestionRepositoryQueryImpl(Class<ResourceInstSug> businessClass) {
    super(businessClass);
  }

  public ResourceInstantiationSuggestionRepositoryQueryImpl() {
    super(ResourceInstSug.class);
  }
}
