package br.ufpa.labes.spm.repository.impl.activities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.activities.DecomposedRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Decomposed;

public class DecomposedRepositoryQueryImpl extends BaseRepositoryQueryImpl<Decomposed, Long> implements DecomposedRepositoryQuery {

  protected DecomposedRepositoryQueryImpl(Class<Decomposed> businessClass) {
    super(businessClass);
  }

  public DecomposedRepositoryQueryImpl() {
    super(Decomposed.class);
  }
}
