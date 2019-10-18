package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.log.ISpmLogDAO;
import br.ufpa.labes.spm.domain.SpmLog;

public class SpmLogDAO extends BaseDAOImpl<SpmLog, Long> implements ISpmLogDAO {

  protected SpmLogDAO(Class<SpmLog> businessClass) {
    super(businessClass);
  }

  public SpmLogDAO() {
    super(SpmLog.class);
  }
}
