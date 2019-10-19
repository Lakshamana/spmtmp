package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IAbilityRepositoryQuery;
import br.ufpa.labes.spm.domain.Ability;

public class AbilityRepositoryQueryImpl extends BaseRepositoryQueryImpl<Ability, Long> implements IAbilityRepositoryQuery {

  protected AbilityRepositoryQueryImpl(Class<Ability> businessClass) {
    super(businessClass);
  }

  public AbilityRepositoryQueryImpl() {
    super(Ability.class);
  }
}