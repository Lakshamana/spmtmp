package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.AgentPlaysRoleRepositoryQuery;
import br.ufpa.labes.spm.domain.AgentPlaysRole;

public class AgentPlaysRoleRepositoryQueryImpl extends BaseRepositoryQueryImpl<AgentPlaysRole, Long>
    implements AgentPlaysRoleRepositoryQuery{

  protected AgentPlaysRoleRepositoryQueryImpl(Class<AgentPlaysRole> businessClass) {
    super(businessClass);
  }

  public AgentPlaysRoleRepositoryQueryImpl() {
    super(AgentPlaysRole.class);
  }
}
