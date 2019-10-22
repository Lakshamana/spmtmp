package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.processKnowledge.MetricRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Metric;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Metric entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MetricRepository extends JpaRepository<Metric, Long> {

}
