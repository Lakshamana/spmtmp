package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.processKnowledge.ActivityEstimationRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.ActivityEstimation;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ActivityEstimation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ActivityEstimationRepository extends BaseRepositoryQuery<ActivityEstimation, Long> {

}
