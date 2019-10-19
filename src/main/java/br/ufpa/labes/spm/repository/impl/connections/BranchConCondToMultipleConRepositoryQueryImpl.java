package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.BranchConCondToMultipleConRepositoryQuery;
import br.ufpa.labes.spm.domain.BranchConCondToMultipleCon;

public class BranchConCondToMultipleConRepositoryQueryImpl extends BaseRepositoryQueryImpl<BranchConCondToMultipleCon, Long>
    implements BranchConCondToMultipleConRepositoryQuery{

  protected BranchConCondToMultipleConRepositoryQueryImpl(Class<BranchConCondToMultipleCon> businessClass) {
    super(businessClass);
  }

  public BranchConCondToMultipleConRepositoryQueryImpl() {
    super(BranchConCondToMultipleCon.class);
  }
}
