package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IResourceEventRepositoryQuery;
import br.ufpa.labes.spm.domain.ResourceEvent;

public class ResourceEventRepositoryQuery extends BaseRepositoryQueryImpl<ResourceEvent, Long> implements IResourceEventRepositoryQuery {

  protected ResourceEventRepositoryQuery(Class<ResourceEvent> businessClass) {
    super(businessClass);
  }

  public ResourceEventRepositoryQuery() {
    super(ResourceEvent.class);
  }
}
