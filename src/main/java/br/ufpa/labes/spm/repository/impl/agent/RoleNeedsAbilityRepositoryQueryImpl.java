package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IRoleNeedsAbilityRepositoryQuery;
import br.ufpa.labes.spm.domain.RoleNeedsAbility;

public class RoleNeedsAbilityRepositoryQueryImpl extends BaseRepositoryQueryImpl<RoleNeedsAbility, Long>
    implements IRoleNeedsAbilityRepositoryQuery {

  protected RoleNeedsAbilityRepositoryQueryImpl(Class<RoleNeedsAbility> businessClass) {
    super(businessClass);
  }

  public RoleNeedsAbilityRepositoryQueryImpl() {
    super(RoleNeedsAbility.class);
  }
}
