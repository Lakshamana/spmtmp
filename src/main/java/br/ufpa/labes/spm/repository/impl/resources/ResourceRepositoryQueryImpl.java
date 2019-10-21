package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.ResourceRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Resource;

public class ResourceRepositoryQueryImpl implements ResourceRepositoryQuery {

  protected ResourceRepositoryQueryImpl(Class<Resource> businessClass) {
    super(businessClass);
  }

  public ResourceRepositoryQueryImpl() {
    super(Resource.class);
  }
}
