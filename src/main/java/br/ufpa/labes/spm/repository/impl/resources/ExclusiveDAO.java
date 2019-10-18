package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IExclusiveDAO;
import br.ufpa.labes.spm.domain.Exclusive;

public class ExclusiveDAO extends BaseDAOImpl<Exclusive, Long> implements IExclusiveDAO {

  protected ExclusiveDAO(Class<Exclusive> businessClass) {
    super(businessClass);
  }

  public ExclusiveDAO() {
    super(Exclusive.class);
  }
}
