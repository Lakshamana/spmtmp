package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.AbilityTypeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.AbilityType;

public class AbilityTypeRepositoryQueryImpl extends BaseRepositoryQueryImpl<AbilityType, Long> implements AbilityTypeRepositoryQuery {

  protected AbilityTypeRepositoryQueryImpl(Class<AbilityType> businessClass) {
    super(businessClass);
  }

  public AbilityTypeRepositoryQueryImpl() {
    super(AbilityType.class);
  }
}
