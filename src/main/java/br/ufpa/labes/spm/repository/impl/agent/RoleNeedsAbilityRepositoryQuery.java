package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IRoleNeedsAbilityRepositoryQuery;
import br.ufpa.labes.spm.domain.RoleNeedsAbility;

public class RoleNeedsAbilityRepositoryQuery extends BaseRepositoryQueryImpl<RoleNeedsAbility, Long>
    implements IRoleNeedsAbilityRepositoryQuery {

  protected RoleNeedsAbilityRepositoryQuery(Class<RoleNeedsAbility> businessClass) {
    super(businessClass);
  }

  public RoleNeedsAbilityRepositoryQuery() {
    super(RoleNeedsAbility.class);
  }
}
