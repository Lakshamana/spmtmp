package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IAgentMetricDAO;
import br.ufpa.labes.spm.domain.AgentMetric;

public class AgentMetricDAO extends BaseRepositoryQueryImpl<AgentMetric, Long> implements IAgentMetricDAO {

  protected AgentMetricDAO(Class<AgentMetric> businessClass) {
    super(businessClass);
  }

  public AgentMetricDAO() {
    super(AgentMetric.class);
  }
}
