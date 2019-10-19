package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IAbilityTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.AbilityType;

public class AbilityTypeRepositoryQueryImpl extends BaseRepositoryQueryImpl<AbilityType, Long> implements IAbilityTypeRepositoryQuery {

  protected AbilityTypeRepositoryQueryImpl(Class<AbilityType> businessClass) {
    super(businessClass);
  }

  public AbilityTypeRepositoryQueryImpl() {
    super(AbilityType.class);
  }
}
