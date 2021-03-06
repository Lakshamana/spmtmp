package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.plannerInfo.AgentWorkingLoadRepositoryQuery;


import br.ufpa.labes.spm.domain.AgentWorkingLoad;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AgentWorkingLoad entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AgentWorkingLoadRepository extends AgentWorkingLoadRepositoryQuery, JpaRepository<AgentWorkingLoad, Long> {

}
