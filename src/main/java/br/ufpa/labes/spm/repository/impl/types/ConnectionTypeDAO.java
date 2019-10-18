package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IConnectionTypeDAO;
import br.ufpa.labes.spm.domain.ConnectionType;

public class ConnectionTypeDAO extends BaseRepositoryQueryImpl<ConnectionType, Long>
    implements IConnectionTypeDAO {

  protected ConnectionTypeDAO(Class<ConnectionType> businessClass) {
    super(businessClass);
  }

  public ConnectionTypeDAO() {
    super(ConnectionType.class);
  }
}
