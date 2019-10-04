package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseDAO;
import br.ufpa.labes.spm.repository.interfaces.agent.IRoleDAO;
import br.ufpa.labes.spm.domain.Role;

public class RoleDAO extends BaseDAO<Role, String> implements IRoleDAO {

  protected RoleDAO(Class<Role> businessClass) {
    super(businessClass);
  }

  public RoleDAO() {
    super(Role.class);
  }
}
