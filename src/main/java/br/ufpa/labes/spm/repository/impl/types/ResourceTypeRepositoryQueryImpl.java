package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IResourceTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.ResourceType;

public class ResourceTypeRepositoryQueryImpl extends BaseRepositoryQueryImpl<ResourceType, Long> implements IResourceTypeRepositoryQuery {

  protected ResourceTypeRepositoryQueryImpl(Class<ResourceType> businessClass) {
    super(businessClass);
  }

  public ResourceTypeRepositoryQueryImpl() {
    super(ResourceType.class);
  }
}
