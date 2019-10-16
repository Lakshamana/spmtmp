package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseDAO;
import br.ufpa.labes.spm.repository.interfaces.log.IResourceEventDAO;
import br.ufpa.labes.spm.domain.ResourceEvent;

public class ResourceEventDAO extends BaseDAO<ResourceEvent, Long> implements IResourceEventDAO {

  protected ResourceEventDAO(Class<ResourceEvent> businessClass) {
    super(businessClass);
  }

  public ResourceEventDAO() {
    super(ResourceEvent.class);
  }
}
