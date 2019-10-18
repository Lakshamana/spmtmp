package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IResourceRepositoryQuery;
import br.ufpa.labes.spm.domain.Resource;

public class ResourceRepositoryQuery extends BaseRepositoryQueryImpl<Resource, Long> implements IResourceRepositoryQuery {

  protected ResourceRepositoryQuery(Class<Resource> businessClass) {
    super(businessClass);
  }

  public ResourceRepositoryQuery() {
    super(Resource.class);
  }
}
