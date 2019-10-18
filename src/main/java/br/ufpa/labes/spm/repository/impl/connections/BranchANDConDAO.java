package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IBranchANDConDAO;
import br.ufpa.labes.spm.domain.BranchANDCon;

public class BranchANDConDAO extends BaseDAOImpl<BranchANDCon, Long> implements IBranchANDConDAO {

  protected BranchANDConDAO(Class<BranchANDCon> businessClass) {
    super(businessClass);
  }

  public BranchANDConDAO() {
    super(BranchANDCon.class);
  }
}
