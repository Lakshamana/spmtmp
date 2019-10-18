package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IConnectionRepositoryQuery;
import br.ufpa.labes.spm.domain.Connection;

public class ConnectionRepositoryQuery extends BaseRepositoryQueryImpl<Connection, Long> implements IConnectionRepositoryQuery {

  protected ConnectionRepositoryQuery(Class<Connection> businessClass) {
    super(businessClass);
  }

  public ConnectionRepositoryQuery() {
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
