package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.plannerInfo.AgentInstSuggestionToAgentRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.AgentInstSuggestionToAgent;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AgentInstSuggestionToAgent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AgentInstSuggestionToAgentRepository extends BaseRepositoryQuery<AgentInstSuggestionToAgent, Long>, JpaRepository<AgentInstSuggestionToAgent, Long> {

}
