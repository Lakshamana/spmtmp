package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.agent.IAgentAffinityAgentRepositoryQuery;


import br.ufpa.labes.spm.domain.AgentAffinityAgent;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AgentAffinityAgent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AgentAffinityAgentRepository extends IAgentAffinityAgentRepositoryQuery, JpaRepository<AgentAffinityAgent, Long> {

}
