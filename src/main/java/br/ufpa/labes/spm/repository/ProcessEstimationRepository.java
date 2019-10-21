package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.processKnowledge.ProcessEstimationRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.ProcessEstimation;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ProcessEstimation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProcessEstimationRepository extends BaseRepositoryQuery<ProcessEstimation, Long> {

}
