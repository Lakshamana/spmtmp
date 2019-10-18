package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IConfiRepositoryQuery;
import br.ufpa.labes.spm.domain.SpmConfiguration;

public class ConfiRepositoryQuery extends BaseRepositoryQueryImpl<SpmConfiguration, Long> implements IConfiRepositoryQuery {

  protected ConfiRepositoryQuery(Class<SpmConfiguration> businessClass) {
    super(businessClass);
  }

  public ConfiRepositoryQuery() {
    super(SpmConfiguration.class);
  }
}
