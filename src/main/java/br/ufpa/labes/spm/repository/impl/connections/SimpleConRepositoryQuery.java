package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.ISimpleConRepositoryQuery;
import br.ufpa.labes.spm.domain.SimpleCon;

public class SimpleConRepositoryQuery extends BaseRepositoryQueryImpl<SimpleCon, Long> implements ISimpleConRepositoryQuery {

  protected SimpleConRepositoryQuery(Class<SimpleCon> businessClass) {
    super(businessClass);
  }

  public SimpleConRepositoryQuery() {
    super(SimpleCon.class);
  }
}
