package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IAgentWorkingLoadRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentWorkingLoad;

public class AgentWorkingLoadRepositoryQuery extends BaseRepositoryQueryImpl<AgentWorkingLoad, Long>
    implements IAgentWorkingLoadRepositoryQuery {

  protected AgentWorkingLoadRepositoryQuery(Class<AgentWorkingLoad> businessClass) {
    super(businessClass);
  }

  public AgentWorkingLoadRepositoryQuery() {
    super(AgentWorkingLoad.class);
  }
}
