package br.ufpa.labes.spm.repository.impl.organizationPolicies;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.IDevelopingSystemRepositoryQuery;
import br.ufpa.labes.spm.domain.DevelopingSystem;

public class DevelopingSystemRepositoryQuery extends BaseRepositoryQueryImpl<DevelopingSystem, Long>
    implements IDevelopingSystemRepositoryQuery {

  protected DevelopingSystemRepositoryQuery(Class<DevelopingSystem> businessClass) {
    super(businessClass);
  }

  public DevelopingSystemRepositoryQuery() {
    super(DevelopingSystem.class);
  }
}
