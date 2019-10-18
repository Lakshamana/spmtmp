package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IConfiDAO;
import br.ufpa.labes.spm.domain.SpmConfiguration;

public class ConfiDAO extends BaseRepositoryQueryImpl<SpmConfiguration, Long> implements IConfiDAO {

  protected ConfiDAO(Class<SpmConfiguration> businessClass) {
    super(businessClass);
  }

  public ConfiDAO() {
    super(SpmConfiguration.class);
  }
}
