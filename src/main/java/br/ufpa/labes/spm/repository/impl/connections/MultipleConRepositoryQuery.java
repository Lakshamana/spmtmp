package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IMultipleConRepositoryQuery;
import br.ufpa.labes.spm.domain.MultipleCon;

public class MultipleConRepositoryQuery extends BaseRepositoryQueryImpl<MultipleCon, Long> implements IMultipleConRepositoryQuery {

  protected MultipleConRepositoryQuery(Class<MultipleCon> businessClass) {
    super(businessClass);
  }

  public MultipleConRepositoryQuery() {
    super(MultipleCon.class);
  }
}
