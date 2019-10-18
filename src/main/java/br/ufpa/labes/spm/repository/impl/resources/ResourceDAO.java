package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IResourceDAO;
import br.ufpa.labes.spm.domain.Resource;

public class ResourceDAO extends BaseRepositoryQueryImpl<Resource, Long> implements IResourceDAO {

  protected ResourceDAO(Class<Resource> businessClass) {
    super(businessClass);
  }

  public ResourceDAO() {
    super(Resource.class);
  }
}
