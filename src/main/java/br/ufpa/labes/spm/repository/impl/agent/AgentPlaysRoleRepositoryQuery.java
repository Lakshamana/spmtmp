package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IAgentPlaysRoleRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentPlaysRole;

public class AgentPlaysRoleRepositoryQuery extends BaseRepositoryQueryImpl<AgentPlaysRole, Long>
    implements IAgentPlaysRoleRepositoryQuery {

  protected AgentPlaysRoleRepositoryQuery(Class<AgentPlaysRole> businessClass) {
    super(businessClass);
  }

  public AgentPlaysRoleRepositoryQuery() {
    super(AgentPlaysRole.class);
  }
}
