package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IAgentInstSuggestionToAgentDAO;
import br.ufpa.labes.spm.domain.AgentInstSuggestionToAgent;

public class AgentInstSuggestionToAgentDAO extends BaseDAOImpl<AgentInstSuggestionToAgent, Long>
    implements IAgentInstSuggestionToAgentDAO {

  protected AgentInstSuggestionToAgentDAO(Class<AgentInstSuggestionToAgent> businessClass) {
    super(businessClass);
  }

  public AgentInstSuggestionToAgentDAO() {
    super(AgentInstSuggestionToAgent.class);
  }
}
