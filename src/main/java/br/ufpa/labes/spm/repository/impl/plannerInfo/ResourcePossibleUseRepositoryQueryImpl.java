package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IResourcePossibleUseRepositoryQuery;
import br.ufpa.labes.spm.domain.ResourcePossibleUse;

public class ResourcePossibleUseRepositoryQueryImpl extends BaseRepositoryQueryImpl<ResourcePossibleUse, Long>
    implements IResourcePossibleUseRepositoryQuery {

  protected ResourcePossibleUseRepositoryQueryImpl(Class<ResourcePossibleUse> businessClass) {
    super(businessClass);
  }

  public ResourcePossibleUseRepositoryQueryImpl() {
    super(ResourcePossibleUse.class);
  }
}
