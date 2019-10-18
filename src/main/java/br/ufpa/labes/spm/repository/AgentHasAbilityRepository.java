package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.agent.IAgentHasAbilityRepositoryQuery;


import br.ufpa.labes.spm.domain.AgentHasAbility;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AgentHasAbility entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AgentHasAbilityRepository extends IAgentHasAbilityRepositoryQuery, JpaRepository<AgentHasAbility, Long> {

}
