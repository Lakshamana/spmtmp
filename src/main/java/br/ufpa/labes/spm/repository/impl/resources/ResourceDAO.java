package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IResourceDAO;
import br.ufpa.labes.spm.domain.Resource;

public class ResourceDAO extends BaseDAOImpl<Resource, Long> implements IResourceDAO {

  protected ResourceDAO(Class<Resource> businessClass) {
    super(businessClass);
  }

  public ResourceDAO() {
    super(Resource.class);
  }
}
