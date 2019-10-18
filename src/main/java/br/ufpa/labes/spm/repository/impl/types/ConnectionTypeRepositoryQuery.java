package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IConnectionTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.ConnectionType;

public class ConnectionTypeRepositoryQuery extends BaseRepositoryQueryImpl<ConnectionType, Long>
    implements IConnectionTypeRepositoryQuery {

  protected ConnectionTypeRepositoryQuery(Class<ConnectionType> businessClass) {
    super(businessClass);
  }

  public ConnectionTypeRepositoryQuery() {
    super(ConnectionType.class);
  }
}
