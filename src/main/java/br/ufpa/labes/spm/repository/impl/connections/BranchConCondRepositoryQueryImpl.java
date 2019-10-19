package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IBranchConCondRepositoryQuery;
import br.ufpa.labes.spm.domain.BranchConCond;

public class BranchConCondRepositoryQueryImpl extends BaseRepositoryQueryImpl<BranchConCond, Long> implements IBranchConCondRepositoryQuery {

  protected BranchConCondRepositoryQueryImpl(Class<BranchConCond> businessClass) {
    super(businessClass);
  }

  public BranchConCondRepositoryQueryImpl() {
    super(BranchConCond.class);
  }
}
