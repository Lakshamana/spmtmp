package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.processKnowledge.ActivityMetricRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.ActivityMetric;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ActivityMetric entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ActivityMetricRepository extends BaseRepositoryQuery<ActivityMetric, Long>, JpaRepository<ActivityMetric, Long> {

}
