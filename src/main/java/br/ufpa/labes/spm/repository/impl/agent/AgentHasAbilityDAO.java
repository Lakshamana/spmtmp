package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IAgentHasAbilityDAO;
import br.ufpa.labes.spm.domain.AgentHasAbility;

public class AgentHasAbilityDAO extends BaseDAOImpl<AgentHasAbility, Long>
    implements IAgentHasAbilityDAO {

  protected AgentHasAbilityDAO(Class<AgentHasAbility> businessClass) {
    super(businessClass);
  }

  public AgentHasAbilityDAO() {
    super(AgentHasAbility.class);
  }
}
