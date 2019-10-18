package br.ufpa.labes.spm.repository.impl.activities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.activities.IDecomposedRepositoryQuery;
import br.ufpa.labes.spm.domain.Decomposed;

public class DecomposedRepositoryQuery extends BaseRepositoryQueryImpl<Decomposed, Long> implements IDecomposedRepositoryQuery {

  protected DecomposedRepositoryQuery(Class<Decomposed> businessClass) {
    super(businessClass);
  }

  public DecomposedRepositoryQuery() {
    super(Decomposed.class);
  }
}
