package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.ArtifactConRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactCon;

public class ArtifactConRepositoryQueryImpl implements ArtifactConRepositoryQuery {

  protected ArtifactConRepositoryQueryImpl(Class<ArtifactCon> businessClass) {
    super(businessClass);
  }

  public ArtifactConRepositoryQueryImpl() {
    super(ArtifactCon.class);
  }

  // @Override
  // public ArtifactCon save(ArtifactCon conn) {
  //   super.save(conn);
  //   String ident = conn.getIdent() + "." + conn.getId();
  //   conn.setIdent(ident);
  //   this.update(conn);
  //   return conn;
  // }
}
