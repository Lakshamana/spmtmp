package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.ConnectionTypeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ConnectionType;

public class ConnectionTypeRepositoryQueryImpl extends BaseRepositoryQueryImpl<ConnectionType, Long>
    implements ConnectionTypeRepositoryQuery{

  protected ConnectionTypeRepositoryQueryImpl(Class<ConnectionType> businessClass) {
    super(businessClass);
  }

  public ConnectionTypeRepositoryQueryImpl() {
    super(ConnectionType.class);
  }
}
