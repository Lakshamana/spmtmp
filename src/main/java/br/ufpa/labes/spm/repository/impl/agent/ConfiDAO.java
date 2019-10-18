package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IConfiDAO;
import br.ufpa.labes.spm.domain.SpmConfiguration;

public class ConfiDAO extends BaseDAOImpl<SpmConfiguration, Long> implements IConfiDAO {

  protected ConfiDAO(Class<SpmConfiguration> businessClass) {
    super(businessClass);
  }

  public ConfiDAO() {
    super(SpmConfiguration.class);
  }
}
