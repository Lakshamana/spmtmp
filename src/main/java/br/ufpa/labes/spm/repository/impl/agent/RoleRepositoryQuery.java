package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IRoleRepositoryQuery;
import br.ufpa.labes.spm.domain.Role;

public class RoleRepositoryQuery extends BaseRepositoryQueryImpl<Role, Long> implements IRoleRepositoryQuery {

  protected RoleRepositoryQuery(Class<Role> businessClass) {
    super(businessClass);
  }

  public RoleRepositoryQuery() {
    super(Role.class);
  }
}
