package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.log.CatalogEventRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.CatalogEvent;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the CatalogEvent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CatalogEventRepository extends BaseRepositoryQuery<CatalogEvent, Long> {

}
