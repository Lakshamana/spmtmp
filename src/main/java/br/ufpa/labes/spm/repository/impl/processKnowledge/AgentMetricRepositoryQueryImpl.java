package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.AgentMetricRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentMetric;

public class AgentMetricRepositoryQueryImpl implements AgentMetricRepositoryQuery {

  protected AgentMetricRepositoryQueryImpl(Class<AgentMetric> businessClass) {
    super(businessClass);
  }

  public AgentMetricRepositoryQueryImpl() {
    super(AgentMetric.class);
  }
}
