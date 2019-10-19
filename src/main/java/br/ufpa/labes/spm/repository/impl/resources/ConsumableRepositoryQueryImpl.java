package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IConsumableRepositoryQuery;
import br.ufpa.labes.spm.domain.Consumable;

public class ConsumableRepositoryQueryImpl extends BaseRepositoryQueryImpl<Consumable, Long> implements IConsumableRepositoryQuery {

  protected ConsumableRepositoryQueryImpl(Class<Consumable> businessClass) {
    super(businessClass);
  }

  public ConsumableRepositoryQueryImpl() {
    super(Consumable.class);
  }
}
