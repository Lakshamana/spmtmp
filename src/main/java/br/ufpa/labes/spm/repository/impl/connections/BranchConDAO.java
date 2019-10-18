package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IBranchConDAO;
import br.ufpa.labes.spm.domain.BranchCon;

public class BranchConDAO extends BaseRepositoryQueryImpl<BranchCon, Long> implements IBranchConDAO {

  protected BranchConDAO(Class<BranchCon> businessClass) {
    super(businessClass);
  }

  public BranchConDAO() {
    super(BranchCon.class);
  }
}
