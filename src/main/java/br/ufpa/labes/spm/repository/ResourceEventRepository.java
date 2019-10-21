package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.log.ResourceEventRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.ResourceEvent;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ResourceEvent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ResourceEventRepository extends BaseRepositoryQuery<ResourceEvent, Long>, JpaRepository<ResourceEvent, Long> {

}
