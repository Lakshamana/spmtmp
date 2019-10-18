package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.processModelGraphic.IWebAPSEEObjectRepositoryQuery;


import br.ufpa.labes.spm.domain.WebAPSEEObject;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the WebAPSEEObject entity.
 */
@SuppressWarnings("unused")
@Repository
public interface WebAPSEEObjectRepository extends IWebAPSEEObjectRepositoryQuery, JpaRepository<WebAPSEEObject, Long> {

}
