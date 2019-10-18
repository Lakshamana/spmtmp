package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IJoinConDAO;
import br.ufpa.labes.spm.domain.JoinCon;

public class JoinConDAO extends BaseDAOImpl<JoinCon, Long> implements IJoinConDAO {

  protected JoinConDAO(Class<JoinCon> businessClass) {
    super(businessClass);
  }

  public JoinConDAO() {
    super(JoinCon.class);
  }
}
