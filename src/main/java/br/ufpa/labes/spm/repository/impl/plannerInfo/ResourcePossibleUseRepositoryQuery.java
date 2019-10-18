package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IResourcePossibleUseRepositoryQuery;
import br.ufpa.labes.spm.domain.ResourcePossibleUse;

public class ResourcePossibleUseRepositoryQuery extends BaseRepositoryQueryImpl<ResourcePossibleUse, Long>
    implements IResourcePossibleUseRepositoryQuery {

  protected ResourcePossibleUseRepositoryQuery(Class<ResourcePossibleUse> businessClass) {
    super(businessClass);
  }

  public ResourcePossibleUseRepositoryQuery() {
    super(ResourcePossibleUse.class);
  }
}
