package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.agent.WorkGroupRepositoryQuery;


import br.ufpa.labes.spm.domain.WorkGroup;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the WorkGroup entity.
 */
@SuppressWarnings("unused")
@Repository
public interface WorkGroupRepository extends WorkGroupRepositoryQuery, JpaRepository<WorkGroup, Long> {

}
