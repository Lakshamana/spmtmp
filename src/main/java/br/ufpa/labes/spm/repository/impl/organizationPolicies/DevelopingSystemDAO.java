package br.ufpa.labes.spm.repository.impl.organizationPolicies;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.IDevelopingSystemDAO;
import br.ufpa.labes.spm.domain.DevelopingSystem;

public class DevelopingSystemDAO extends BaseDAOImpl<DevelopingSystem, Long>
    implements IDevelopingSystemDAO {

  protected DevelopingSystemDAO(Class<DevelopingSystem> businessClass) {
    super(businessClass);
  }

  public DevelopingSystemDAO() {
    super(DevelopingSystem.class);
  }
}
