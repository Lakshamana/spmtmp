package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IRoleDAO;
import br.ufpa.labes.spm.domain.Role;

public class RoleDAO extends BaseRepositoryQueryImpl<Role, Long> implements IRoleDAO {

  protected RoleDAO(Class<Role> businessClass) {
    super(businessClass);
  }

  public RoleDAO() {
    super(Role.class);
  }
}
