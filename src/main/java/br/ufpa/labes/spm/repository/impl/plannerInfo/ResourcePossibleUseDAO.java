package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IResourcePossibleUseDAO;
import br.ufpa.labes.spm.domain.ResourcePossibleUse;

public class ResourcePossibleUseDAO extends BaseRepositoryQueryImpl<ResourcePossibleUse, Long>
    implements IResourcePossibleUseDAO {

  protected ResourcePossibleUseDAO(Class<ResourcePossibleUse> businessClass) {
    super(businessClass);
  }

  public ResourcePossibleUseDAO() {
    super(ResourcePossibleUse.class);
  }
}
