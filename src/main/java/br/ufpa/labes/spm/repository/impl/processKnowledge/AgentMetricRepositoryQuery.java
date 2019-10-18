package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IAgentMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentMetric;

public class AgentMetricRepositoryQuery extends BaseRepositoryQueryImpl<AgentMetric, Long> implements IAgentMetricRepositoryQuery {

  protected AgentMetricRepositoryQuery(Class<AgentMetric> businessClass) {
    super(businessClass);
  }

  public AgentMetricRepositoryQuery() {
    super(AgentMetric.class);
  }
}
