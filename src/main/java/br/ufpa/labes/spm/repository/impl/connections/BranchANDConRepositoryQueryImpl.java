package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.BranchANDConRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.BranchANDCon;

public class BranchANDConRepositoryQueryImpl implements BranchANDConRepositoryQuery {

  protected BranchANDConRepositoryQueryImpl(Class<BranchANDCon> businessClass) {
    super(businessClass);
  }

  public BranchANDConRepositoryQueryImpl() {
    super(BranchANDCon.class);
  }
}
