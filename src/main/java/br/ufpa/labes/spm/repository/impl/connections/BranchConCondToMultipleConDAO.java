package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IBranchConCondToMultipleConDAO;
import br.ufpa.labes.spm.domain.BranchConCondToMultipleCon;

public class BranchConCondToMultipleConDAO extends BaseRepositoryQueryImpl<BranchConCondToMultipleCon, Long>
    implements IBranchConCondToMultipleConDAO {

  protected BranchConCondToMultipleConDAO(Class<BranchConCondToMultipleCon> businessClass) {
    super(businessClass);
  }

  public BranchConCondToMultipleConDAO() {
    super(BranchConCondToMultipleCon.class);
  }
}
