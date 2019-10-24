package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.ConnectionRepositoryQuery;
import br.ufpa.labes.spm.domain.Connection;

public class ConnectionRepositoryQueryImpl implements ConnectionRepositoryQuery{

  protected ConnectionRepositoryQueryImpl(Class<Connection> businessClass) {
    super(businessClass);
  }

  public ConnectionRepositoryQueryImpl() {
    super(Connection.class);
  }

  // @Override
  // public Connection save(Connection conn) {

  //   super.save(conn);
  //   String ident = conn.getIdent() + "." + conn.getId();
  //   conn.setIdent(ident);
  //   this.update(conn);
  //   return conn;
  // }
}
