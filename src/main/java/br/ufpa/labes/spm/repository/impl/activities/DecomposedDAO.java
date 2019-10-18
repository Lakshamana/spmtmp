package br.ufpa.labes.spm.repository.impl.activities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.activities.IDecomposedDAO;
import br.ufpa.labes.spm.domain.Decomposed;

public class DecomposedDAO extends BaseRepositoryQueryImpl<Decomposed, Long> implements IDecomposedDAO {

  protected DecomposedDAO(Class<Decomposed> businessClass) {
    super(businessClass);
  }

  public DecomposedDAO() {
    super(Decomposed.class);
  }
}
