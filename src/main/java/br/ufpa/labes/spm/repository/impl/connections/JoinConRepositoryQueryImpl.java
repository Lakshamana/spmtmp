package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.JoinConRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.JoinCon;

public class JoinConRepositoryQueryImpl extends BaseRepositoryQueryImpl<JoinCon, Long> implements JoinConRepositoryQuery {

  protected JoinConRepositoryQueryImpl(Class<JoinCon> businessClass) {
    super(businessClass);
  }

  public JoinConRepositoryQueryImpl() {
    super(JoinCon.class);
  }
}
