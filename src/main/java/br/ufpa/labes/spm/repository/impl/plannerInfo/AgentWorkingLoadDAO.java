package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IAgentWorkingLoadDAO;
import br.ufpa.labes.spm.domain.AgentWorkingLoad;

public class AgentWorkingLoadDAO extends BaseDAOImpl<AgentWorkingLoad, Long>
    implements IAgentWorkingLoadDAO {

  protected AgentWorkingLoadDAO(Class<AgentWorkingLoad> businessClass) {
    super(businessClass);
  }

  public AgentWorkingLoadDAO() {
    super(AgentWorkingLoad.class);
  }
}
