package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IAbilityDAO;
import br.ufpa.labes.spm.domain.Ability;

public class AbilityDAO extends BaseRepositoryQueryImpl<Ability, Long> implements IAbilityDAO {

  protected AbilityDAO(Class<Ability> businessClass) {
    super(businessClass);
  }

  public AbilityDAO() {
    super(Ability.class);
  }
}
