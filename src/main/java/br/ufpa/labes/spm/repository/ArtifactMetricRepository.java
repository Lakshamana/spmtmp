package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IArtifactMetricRepositoryQuery;


import br.ufpa.labes.spm.domain.ArtifactMetric;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ArtifactMetric entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ArtifactMetricRepository extends IArtifactMetricRepositoryQuery, JpaRepository<ArtifactMetric, Long> {

}
