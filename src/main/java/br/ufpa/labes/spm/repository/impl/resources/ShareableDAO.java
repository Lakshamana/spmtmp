package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IShareableDAO;
import br.ufpa.labes.spm.domain.Shareable;

public class ShareableDAO extends BaseDAOImpl<Shareable, Long> implements IShareableDAO {

  protected ShareableDAO(Class<Shareable> businessClass) {
    super(businessClass);
  }

  public ShareableDAO() {
    super(Shareable.class);
  }
}
