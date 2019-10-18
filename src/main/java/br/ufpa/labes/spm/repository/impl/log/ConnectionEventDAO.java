package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IConnectionEventDAO;
import br.ufpa.labes.spm.domain.ConnectionEvent;

public class ConnectionEventDAO extends BaseRepositoryQueryImpl<ConnectionEvent, Long>
    implements IConnectionEventDAO {

  protected ConnectionEventDAO(Class<ConnectionEvent> businessClass) {
    super(businessClass);
  }

  public ConnectionEventDAO() {
    super(ConnectionEvent.class);
  }
}
