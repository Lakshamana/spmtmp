package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IJoinConDAO;
import br.ufpa.labes.spm.domain.JoinCon;

public class JoinConDAO extends BaseRepositoryQueryImpl<JoinCon, Long> implements IJoinConDAO {

  protected JoinConDAO(Class<JoinCon> businessClass) {
    super(businessClass);
  }

  public JoinConDAO() {
    super(JoinCon.class);
  }
}
