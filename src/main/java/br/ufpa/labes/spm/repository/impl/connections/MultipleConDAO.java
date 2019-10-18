package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IMultipleConDAO;
import br.ufpa.labes.spm.domain.MultipleCon;

public class MultipleConDAO extends BaseDAOImpl<MultipleCon, Long> implements IMultipleConDAO {

  protected MultipleConDAO(Class<MultipleCon> businessClass) {
    super(businessClass);
  }

  public MultipleConDAO() {
    super(MultipleCon.class);
  }
}
