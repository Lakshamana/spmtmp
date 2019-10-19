package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.domain.SpmConfiguration;
import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.SpmConfigurationRepositoryQuery;

public class SpmConfigurationRepositoryQueryImpl extends BaseRepositoryQueryImpl<SpmConfiguration, Long> implements SpmConfigurationRepositoryQuery{

  protected SpmConfigurationRepositoryQueryImpl(Class<SpmConfiguration> businessClass) {
    super(businessClass);
  }

  public SpmConfigurationRepositoryQueryImpl() {
    super(SpmConfiguration.class);
  }
}
