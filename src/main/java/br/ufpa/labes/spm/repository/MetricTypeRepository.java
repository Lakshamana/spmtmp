package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.types.MetricTypeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.MetricType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the MetricType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MetricTypeRepository extends BaseRepositoryQuery<MetricType, Long>, JpaRepository<MetricType, Long> {

}
