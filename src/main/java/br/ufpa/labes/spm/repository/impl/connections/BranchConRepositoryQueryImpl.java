package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.BranchConRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.BranchCon;

public class BranchConRepositoryQueryImpl implements BranchConRepositoryQuery {

  protected BranchConRepositoryQueryImpl(Class<BranchCon> businessClass) {
    super(businessClass);
  }

  public BranchConRepositoryQueryImpl() {
    super(BranchCon.class);
  }
}
