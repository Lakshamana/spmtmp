package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.RoleRepositoryQuery;
import br.ufpa.labes.spm.domain.Role;

public class RoleRepositoryQueryImpl extends BaseRepositoryQueryImpl<Role, Long> implements RoleRepositoryQuery{

  protected RoleRepositoryQueryImpl(Class<Role> businessClass) {
    super(businessClass);
  }

  public RoleRepositoryQueryImpl() {
    super(Role.class);
  }
}
