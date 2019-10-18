package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IBranchConRepositoryQuery;
import br.ufpa.labes.spm.domain.BranchCon;

public class BranchConRepositoryQuery extends BaseRepositoryQueryImpl<BranchCon, Long> implements IBranchConRepositoryQuery {

  protected BranchConRepositoryQuery(Class<BranchCon> businessClass) {
    super(businessClass);
  }

  public BranchConRepositoryQuery() {
    super(BranchCon.class);
  }
}
