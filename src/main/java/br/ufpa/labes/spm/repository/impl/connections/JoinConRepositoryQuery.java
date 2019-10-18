package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IJoinConRepositoryQuery;
import br.ufpa.labes.spm.domain.JoinCon;

public class JoinConRepositoryQuery extends BaseRepositoryQueryImpl<JoinCon, Long> implements IJoinConRepositoryQuery {

  protected JoinConRepositoryQuery(Class<JoinCon> businessClass) {
    super(businessClass);
  }

  public JoinConRepositoryQuery() {
    super(JoinCon.class);
  }
}
