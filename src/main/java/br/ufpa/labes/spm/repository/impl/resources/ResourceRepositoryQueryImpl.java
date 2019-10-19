package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IResourceRepositoryQuery;
import br.ufpa.labes.spm.domain.Resource;

public class ResourceRepositoryQueryImpl extends BaseRepositoryQueryImpl<Resource, Long> implements IResourceRepositoryQuery {

  protected ResourceRepositoryQueryImpl(Class<Resource> businessClass) {
    super(businessClass);
  }

  public ResourceRepositoryQueryImpl() {
    super(Resource.class);
  }
}
