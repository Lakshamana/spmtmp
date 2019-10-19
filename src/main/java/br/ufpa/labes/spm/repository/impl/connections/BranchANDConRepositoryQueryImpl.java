package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IBranchANDConRepositoryQuery;
import br.ufpa.labes.spm.domain.BranchANDCon;

public class BranchANDConRepositoryQueryImpl extends BaseRepositoryQueryImpl<BranchANDCon, Long> implements IBranchANDConRepositoryQuery {

  protected BranchANDConRepositoryQueryImpl(Class<BranchANDCon> businessClass) {
    super(businessClass);
  }

  public BranchANDConRepositoryQueryImpl() {
    super(BranchANDCon.class);
  }
}
