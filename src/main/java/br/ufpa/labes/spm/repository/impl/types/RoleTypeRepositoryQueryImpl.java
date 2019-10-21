package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.RoleTypeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.RoleType;

public class RoleTypeRepositoryQueryImpl implements RoleTypeRepositoryQuery {

  protected RoleTypeRepositoryQueryImpl(Class<RoleType> businessClass) {
    super(businessClass);
  }

  public RoleTypeRepositoryQueryImpl() {
    super(RoleType.class);
  }
}
