package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.ResourceTypeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ResourceType;

public class ResourceTypeRepositoryQueryImpl implements ResourceTypeRepositoryQuery {

  protected ResourceTypeRepositoryQueryImpl(Class<ResourceType> businessClass) {
    super(businessClass);
  }

  public ResourceTypeRepositoryQueryImpl() {
    super(ResourceType.class);
  }
}
