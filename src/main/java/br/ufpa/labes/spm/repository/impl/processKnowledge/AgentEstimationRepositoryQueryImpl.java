package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IAgentEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentEstimation;

public class AgentEstimationRepositoryQueryImpl extends BaseRepositoryQueryImpl<AgentEstimation, Long>
    implements IAgentEstimationRepositoryQuery {

  protected AgentEstimationRepositoryQueryImpl(Class<AgentEstimation> businessClass) {
    super(businessClass);
  }

  public AgentEstimationRepositoryQueryImpl() {
    super(AgentEstimation.class);
  }
}
