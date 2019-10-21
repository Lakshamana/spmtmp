package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.processKnowledge.MetricDefinitionRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.MetricDefinition;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the MetricDefinition entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MetricDefinitionRepository extends BaseRepositoryQuery<MetricDefinition, Long>, JpaRepository<MetricDefinition, Long> {

}
