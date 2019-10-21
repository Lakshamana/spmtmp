package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.processKnowledge.ResourceEstimationRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.ResourceEstimation;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ResourceEstimation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ResourceEstimationRepository extends BaseRepositoryQuery<ResourceEstimation, Long>, JpaRepository<ResourceEstimation, Long> {

}
