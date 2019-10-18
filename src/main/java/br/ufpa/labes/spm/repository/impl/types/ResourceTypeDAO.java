package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IResourceTypeDAO;
import br.ufpa.labes.spm.domain.ResourceType;

public class ResourceTypeDAO extends BaseDAOImpl<ResourceType, Long> implements IResourceTypeDAO {

  protected ResourceTypeDAO(Class<ResourceType> businessClass) {
    super(businessClass);
  }

  public ResourceTypeDAO() {
    super(ResourceType.class);
  }
}
