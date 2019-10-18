package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IAgentEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentEstimation;

public class AgentEstimationRepositoryQuery extends BaseRepositoryQueryImpl<AgentEstimation, Long>
    implements IAgentEstimationRepositoryQuery {

  protected AgentEstimationRepositoryQuery(Class<AgentEstimation> businessClass) {
    super(businessClass);
  }

  public AgentEstimationRepositoryQuery() {
    super(AgentEstimation.class);
  }
}
