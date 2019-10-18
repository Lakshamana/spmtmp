package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.agent.IAgentPlaysRoleRepositoryQuery;


import br.ufpa.labes.spm.domain.AgentPlaysRole;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AgentPlaysRole entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AgentPlaysRoleRepository extends IAgentPlaysRoleRepositoryQuery, JpaRepository<AgentPlaysRole, Long> {

}
