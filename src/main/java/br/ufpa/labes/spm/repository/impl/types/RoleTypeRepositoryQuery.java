package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IRoleTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.RoleType;

public class RoleTypeRepositoryQuery extends BaseRepositoryQueryImpl<RoleType, Long> implements IRoleTypeRepositoryQuery {

  protected RoleTypeRepositoryQuery(Class<RoleType> businessClass) {
    super(businessClass);
  }

  public RoleTypeRepositoryQuery() {
    super(RoleType.class);
  }
}
