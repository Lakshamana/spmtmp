package br.ufpa.labes.spm.repository.impl.activities;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.activities.IDecomposedDAO;
import br.ufpa.labes.spm.domain.Decomposed;

public class DecomposedDAO extends BaseDAOImpl<Decomposed, Long> implements IDecomposedDAO {

  protected DecomposedDAO(Class<Decomposed> businessClass) {
    super(businessClass);
  }

  public DecomposedDAO() {
    super(Decomposed.class);
  }
}
