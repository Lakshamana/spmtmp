package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IConsumableDAO;
import br.ufpa.labes.spm.domain.Consumable;

public class ConsumableDAO extends BaseDAOImpl<Consumable, Long> implements IConsumableDAO {

  protected ConsumableDAO(Class<Consumable> businessClass) {
    super(businessClass);
  }

  public ConsumableDAO() {
    super(Consumable.class);
  }
}
