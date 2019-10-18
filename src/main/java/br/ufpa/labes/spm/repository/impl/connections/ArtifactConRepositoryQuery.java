package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IArtifactConRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactCon;

public class ArtifactConRepositoryQuery extends BaseRepositoryQueryImpl<ArtifactCon, Long> implements IArtifactConRepositoryQuery {

  protected ArtifactConRepositoryQuery(Class<ArtifactCon> businessClass) {
    super(businessClass);
  }

  public ArtifactConRepositoryQuery() {
    super(ArtifactCon.class);
  }

  @Override
  public ArtifactCon RepositoryQuerySave(ArtifactCon conn) {
    super.RepositoryQuerySave(conn);
    String ident = conn.getIdent() + "." + conn.getId();
    conn.setIdent(ident);
    this.update(conn);
    return conn;
  }
}
