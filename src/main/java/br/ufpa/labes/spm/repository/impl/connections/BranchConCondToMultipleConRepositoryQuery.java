package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IBranchConCondToMultipleConRepositoryQuery;
import br.ufpa.labes.spm.domain.BranchConCondToMultipleCon;

public class BranchConCondToMultipleConRepositoryQuery extends BaseRepositoryQueryImpl<BranchConCondToMultipleCon, Long>
    implements IBranchConCondToMultipleConRepositoryQuery {

  protected BranchConCondToMultipleConRepositoryQuery(Class<BranchConCondToMultipleCon> businessClass) {
    super(businessClass);
  }

  public BranchConCondToMultipleConRepositoryQuery() {
    super(BranchConCondToMultipleCon.class);
  }
}
