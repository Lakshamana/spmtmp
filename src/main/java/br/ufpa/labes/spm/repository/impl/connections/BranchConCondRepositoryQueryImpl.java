package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.BranchConCondRepositoryQuery;
import br.ufpa.labes.spm.domain.BranchConCond;

public class BranchConCondRepositoryQueryImpl extends BaseRepositoryQueryImpl<BranchConCond, Long> implements BranchConCondRepositoryQuery{

  protected BranchConCondRepositoryQueryImpl(Class<BranchConCond> businessClass) {
    super(businessClass);
  }

  public BranchConCondRepositoryQueryImpl() {
    super(BranchConCond.class);
  }
}
