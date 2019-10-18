package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IConsumableRepositoryQuery;
import br.ufpa.labes.spm.domain.Consumable;

public class ConsumableRepositoryQuery extends BaseRepositoryQueryImpl<Consumable, Long> implements IConsumableRepositoryQuery {

  protected ConsumableRepositoryQuery(Class<Consumable> businessClass) {
    super(businessClass);
  }

  public ConsumableRepositoryQuery() {
    super(Consumable.class);
  }
}
