package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IBranchANDConRepositoryQuery;
import br.ufpa.labes.spm.domain.BranchANDCon;

public class BranchANDConRepositoryQuery extends BaseRepositoryQueryImpl<BranchANDCon, Long> implements IBranchANDConRepositoryQuery {

  protected BranchANDConRepositoryQuery(Class<BranchANDCon> businessClass) {
    super(businessClass);
  }

  public BranchANDConRepositoryQuery() {
    super(BranchANDCon.class);
  }
}
