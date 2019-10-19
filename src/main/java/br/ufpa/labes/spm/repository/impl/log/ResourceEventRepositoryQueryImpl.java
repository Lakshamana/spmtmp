package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IResourceEventRepositoryQuery;
import br.ufpa.labes.spm.domain.ResourceEvent;

public class ResourceEventRepositoryQueryImpl extends BaseRepositoryQueryImpl<ResourceEvent, Long> implements IResourceEventRepositoryQuery {

  protected ResourceEventRepositoryQueryImpl(Class<ResourceEvent> businessClass) {
    super(businessClass);
  }

  public ResourceEventRepositoryQueryImpl() {
    super(ResourceEvent.class);
  }
}
