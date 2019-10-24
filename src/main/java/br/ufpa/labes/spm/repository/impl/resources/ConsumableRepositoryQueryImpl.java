package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.ConsumableRepositoryQuery;
import br.ufpa.labes.spm.domain.Consumable;

public class ConsumableRepositoryQueryImpl implements ConsumableRepositoryQuery{

  protected ConsumableRepositoryQueryImpl(Class<Consumable> businessClass) {
    super(businessClass);
  }

  public ConsumableRepositoryQueryImpl() {
    super(Consumable.class);
  }
}
