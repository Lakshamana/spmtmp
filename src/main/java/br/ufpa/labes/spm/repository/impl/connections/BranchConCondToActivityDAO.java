package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IBranchConCondToActivityDAO;
import br.ufpa.labes.spm.domain.BranchConCondToActivity;

public class BranchConCondToActivityDAO extends BaseDAOImpl<BranchConCondToActivity, Long>
    implements IBranchConCondToActivityDAO {

  protected BranchConCondToActivityDAO(Class<BranchConCondToActivity> businessClass) {
    super(businessClass);
  }

  public BranchConCondToActivityDAO() {
    super(BranchConCondToActivity.class);
  }
}
