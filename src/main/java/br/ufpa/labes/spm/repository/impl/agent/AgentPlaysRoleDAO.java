package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IAgentPlaysRoleDAO;
import br.ufpa.labes.spm.domain.AgentPlaysRole;

public class AgentPlaysRoleDAO extends BaseDAOImpl<AgentPlaysRole, Long>
    implements IAgentPlaysRoleDAO {

  protected AgentPlaysRoleDAO(Class<AgentPlaysRole> businessClass) {
    super(businessClass);
  }

  public AgentPlaysRoleDAO() {
    super(AgentPlaysRole.class);
  }
}
