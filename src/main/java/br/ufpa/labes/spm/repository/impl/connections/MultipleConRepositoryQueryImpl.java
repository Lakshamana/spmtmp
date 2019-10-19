package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IMultipleConRepositoryQuery;
import br.ufpa.labes.spm.domain.MultipleCon;

public class MultipleConRepositoryQueryImpl extends BaseRepositoryQueryImpl<MultipleCon, Long> implements IMultipleConRepositoryQuery {

  protected MultipleConRepositoryQueryImpl(Class<MultipleCon> businessClass) {
    super(businessClass);
  }

  public MultipleConRepositoryQueryImpl() {
    super(MultipleCon.class);
  }
}
