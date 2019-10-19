package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IBranchConRepositoryQuery;
import br.ufpa.labes.spm.domain.BranchCon;

public class BranchConRepositoryQueryImpl extends BaseRepositoryQueryImpl<BranchCon, Long> implements IBranchConRepositoryQuery {

  protected BranchConRepositoryQueryImpl(Class<BranchCon> businessClass) {
    super(businessClass);
  }

  public BranchConRepositoryQueryImpl() {
    super(BranchCon.class);
  }
}
