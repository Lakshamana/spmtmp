package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.AgentWorkingLoadRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentWorkingLoad;

public class AgentWorkingLoadRepositoryQueryImpl extends BaseRepositoryQueryImpl<AgentWorkingLoad, Long>
    implements AgentWorkingLoadRepositoryQuery{

  protected AgentWorkingLoadRepositoryQueryImpl(Class<AgentWorkingLoad> businessClass) {
    super(businessClass);
  }

  public AgentWorkingLoadRepositoryQueryImpl() {
    super(AgentWorkingLoad.class);
  }
}
