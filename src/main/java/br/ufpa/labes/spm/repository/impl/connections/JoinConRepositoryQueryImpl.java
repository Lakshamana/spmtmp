package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IJoinConRepositoryQuery;
import br.ufpa.labes.spm.domain.JoinCon;

public class JoinConRepositoryQueryImpl extends BaseRepositoryQueryImpl<JoinCon, Long> implements IJoinConRepositoryQuery {

  protected JoinConRepositoryQueryImpl(Class<JoinCon> businessClass) {
    super(businessClass);
  }

  public JoinConRepositoryQueryImpl() {
    super(JoinCon.class);
  }
}
