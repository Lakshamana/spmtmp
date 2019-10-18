package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IAbilityRepositoryQuery;
import br.ufpa.labes.spm.domain.Ability;

public class AbilityRepositoryQuery extends BaseRepositoryQueryImpl<Ability, Long> implements IAbilityRepositoryQuery {

  protected AbilityRepositoryQuery(Class<Ability> businessClass) {
    super(businessClass);
  }

  public AbilityRepositoryQuery() {
    super(Ability.class);
  }
}
