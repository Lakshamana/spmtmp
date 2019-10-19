package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.ConfiRepositoryQuery;
import br.ufpa.labes.spm.domain.SpmConfiguration;

public class ConfiRepositoryQueryImpl extends BaseRepositoryQueryImpl<SpmConfiguration, Long> implements ConfiRepositoryQuery{

  protected ConfiRepositoryQueryImpl(Class<SpmConfiguration> businessClass) {
    super(businessClass);
  }

  public ConfiRepositoryQueryImpl() {
    super(SpmConfiguration.class);
  }
}
