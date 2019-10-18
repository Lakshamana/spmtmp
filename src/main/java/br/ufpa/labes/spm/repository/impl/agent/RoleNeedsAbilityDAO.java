package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IRoleNeedsAbilityDAO;
import br.ufpa.labes.spm.domain.RoleNeedsAbility;

public class RoleNeedsAbilityDAO extends BaseDAOImpl<RoleNeedsAbility, Long>
    implements IRoleNeedsAbilityDAO {

  protected RoleNeedsAbilityDAO(Class<RoleNeedsAbility> businessClass) {
    super(businessClass);
  }

  public RoleNeedsAbilityDAO() {
    super(RoleNeedsAbility.class);
  }
}
