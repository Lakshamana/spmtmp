package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IRoleTypeDAO;
import br.ufpa.labes.spm.domain.RoleType;

public class RoleTypeDAO extends BaseRepositoryQueryImpl<RoleType, Long> implements IRoleTypeDAO {

  protected RoleTypeDAO(Class<RoleType> businessClass) {
    super(businessClass);
  }

  public RoleTypeDAO() {
    super(RoleType.class);
  }
}
