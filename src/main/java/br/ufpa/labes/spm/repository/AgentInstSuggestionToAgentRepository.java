package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.plannerInfo.AgentInstSuggestionToAgentRepositoryQuery;


import br.ufpa.labes.spm.domain.AgentInstSuggestionToAgent;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AgentInstSuggestionToAgent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AgentInstSuggestionToAgentRepository extends AgentInstSuggestionToAgentRepositoryQuery, JpaRepository<AgentInstSuggestionToAgent, Long> {

}
