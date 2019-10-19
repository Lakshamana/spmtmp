package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IConnectionEventRepositoryQuery;
import br.ufpa.labes.spm.domain.ConnectionEvent;

public class ConnectionEventRepositoryQueryImpl extends BaseRepositoryQueryImpl<ConnectionEvent, Long>
    implements IConnectionEventRepositoryQuery {

  protected ConnectionEventRepositoryQueryImpl(Class<ConnectionEvent> businessClass) {
    super(businessClass);
  }

  public ConnectionEventRepositoryQueryImpl() {
    super(ConnectionEvent.class);
  }
}
