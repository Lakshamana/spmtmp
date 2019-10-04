package br.ufpa.labes.spm.repository.impl.activities;

import br.ufpa.labes.spm.repository.impl.BaseDAO;
import br.ufpa.labes.spm.repository.interfaces.activities.IDecomposedDAO;
import br.ufpa.labes.spm.domain.Decomposed;

public class DecomposedDAO extends BaseDAO<Decomposed, String> implements IDecomposedDAO {

  protected DecomposedDAO(Class<Decomposed> businessClass) {
    super(businessClass);
  }

  public DecomposedDAO() {
    super(Decomposed.class);
  }
}
