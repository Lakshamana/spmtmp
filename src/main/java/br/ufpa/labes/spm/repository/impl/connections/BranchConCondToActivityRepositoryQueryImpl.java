package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.BranchConCondToActivityRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.BranchConCondToActivity;

public class BranchConCondToActivityRepositoryQueryImpl extends BaseRepositoryQueryImpl<BranchConCondToActivity, Long>
    implements BranchConCondToActivityRepositoryQuery{

  protected BranchConCondToActivityRepositoryQueryImpl(Class<BranchConCondToActivity> businessClass) {
    super(businessClass);
  }

  public BranchConCondToActivityRepositoryQueryImpl() {
    super(BranchConCondToActivity.class);
  }
}
