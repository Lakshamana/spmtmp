package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IAbilityTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.AbilityType;

public class AbilityTypeRepositoryQuery extends BaseRepositoryQueryImpl<AbilityType, Long> implements IAbilityTypeRepositoryQuery {

  protected AbilityTypeRepositoryQuery(Class<AbilityType> businessClass) {
    super(businessClass);
  }

  public AbilityTypeRepositoryQuery() {
    super(AbilityType.class);
  }
}
