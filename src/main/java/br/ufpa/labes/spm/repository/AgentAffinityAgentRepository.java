package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.agent.AgentAffinityAgentRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.AgentAffinityAgent;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AgentAffinityAgent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AgentAffinityAgentRepository extends BaseRepositoryQuery<AgentAffinityAgent, Long>, JpaRepository<AgentAffinityAgent, Long> {

}
