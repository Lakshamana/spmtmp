package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.ISimpleConRepositoryQuery;
import br.ufpa.labes.spm.domain.SimpleCon;

public class SimpleConRepositoryQueryImpl extends BaseRepositoryQueryImpl<SimpleCon, Long> implements ISimpleConRepositoryQuery {

  protected SimpleConRepositoryQueryImpl(Class<SimpleCon> businessClass) {
    super(businessClass);
  }

  public SimpleConRepositoryQueryImpl() {
    super(SimpleCon.class);
  }
}