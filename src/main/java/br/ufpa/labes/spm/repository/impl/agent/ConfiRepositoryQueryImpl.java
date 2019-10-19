package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IConfiRepositoryQuery;
import br.ufpa.labes.spm.domain.SpmConfiguration;

public class ConfiRepositoryQueryImpl extends BaseRepositoryQueryImpl<SpmConfiguration, Long> implements IConfiRepositoryQuery {

  protected ConfiRepositoryQueryImpl(Class<SpmConfiguration> businessClass) {
    super(businessClass);
  }

  public ConfiRepositoryQueryImpl() {
    super(SpmConfiguration.class);
  }
}
