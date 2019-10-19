package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IBranchConCondToMultipleConRepositoryQuery;
import br.ufpa.labes.spm.domain.BranchConCondToMultipleCon;

public class BranchConCondToMultipleConRepositoryQueryImpl extends BaseRepositoryQueryImpl<BranchConCondToMultipleCon, Long>
    implements IBranchConCondToMultipleConRepositoryQuery {

  protected BranchConCondToMultipleConRepositoryQueryImpl(Class<BranchConCondToMultipleCon> businessClass) {
    super(businessClass);
  }

  public BranchConCondToMultipleConRepositoryQueryImpl() {
    super(BranchConCondToMultipleCon.class);
  }
}
