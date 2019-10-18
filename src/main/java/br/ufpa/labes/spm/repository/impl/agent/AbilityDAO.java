package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IAbilityDAO;
import br.ufpa.labes.spm.domain.Ability;

public class AbilityDAO extends BaseDAOImpl<Ability, Long> implements IAbilityDAO {

  protected AbilityDAO(Class<Ability> businessClass) {
    super(businessClass);
  }

  public AbilityDAO() {
    super(Ability.class);
  }
}
