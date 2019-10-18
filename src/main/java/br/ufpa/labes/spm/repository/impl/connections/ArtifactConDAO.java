package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IArtifactConDAO;
import br.ufpa.labes.spm.domain.ArtifactCon;

public class ArtifactConDAO extends BaseDAOImpl<ArtifactCon, Long> implements IArtifactConDAO {

  protected ArtifactConDAO(Class<ArtifactCon> businessClass) {
    super(businessClass);
  }

  public ArtifactConDAO() {
    super(ArtifactCon.class);
  }

  @Override
  public ArtifactCon daoSave(ArtifactCon conn) {
    super.daoSave(conn);
    String ident = conn.getIdent() + "." + conn.getId();
    conn.setIdent(ident);
    this.update(conn);
    return conn;
  }
}
