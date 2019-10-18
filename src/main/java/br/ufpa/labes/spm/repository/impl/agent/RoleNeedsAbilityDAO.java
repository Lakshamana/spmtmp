package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IRoleNeedsAbilityDAO;
import br.ufpa.labes.spm.domain.RoleNeedsAbility;

public class RoleNeedsAbilityDAO extends BaseRepositoryQueryImpl<RoleNeedsAbility, Long>
    implements IRoleNeedsAbilityDAO {

  protected RoleNeedsAbilityDAO(Class<RoleNeedsAbility> businessClass) {
    super(businessClass);
  }

  public RoleNeedsAbilityDAO() {
    super(RoleNeedsAbility.class);
  }
}
