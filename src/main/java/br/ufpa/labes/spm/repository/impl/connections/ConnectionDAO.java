package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IConnectionDAO;
import br.ufpa.labes.spm.domain.Connection;

public class ConnectionDAO extends BaseRepositoryQueryImpl<Connection, Long> implements IConnectionDAO {

  protected ConnectionDAO(Class<Connection> businessClass) {
    super(businessClass);
  }

  public ConnectionDAO() {
    super(Connection.class);
  }

  @Override
  public Connection daoSave(Connection conn) {

    super.daoSave(conn);
    String ident = conn.getIdent() + "." + conn.getId();
    conn.setIdent(ident);
    this.update(conn);
    return conn;
  }
}
