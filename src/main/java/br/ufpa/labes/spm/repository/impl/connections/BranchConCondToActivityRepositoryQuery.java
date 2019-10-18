package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IBranchConCondToActivityRepositoryQuery;
import br.ufpa.labes.spm.domain.BranchConCondToActivity;

public class BranchConCondToActivityRepositoryQuery extends BaseRepositoryQueryImpl<BranchConCondToActivity, Long>
    implements IBranchConCondToActivityRepositoryQuery {

  protected BranchConCondToActivityRepositoryQuery(Class<BranchConCondToActivity> businessClass) {
    super(businessClass);
  }

  public BranchConCondToActivityRepositoryQuery() {
    super(BranchConCondToActivity.class);
  }
}
