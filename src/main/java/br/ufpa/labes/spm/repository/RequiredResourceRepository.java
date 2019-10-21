package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.plainActivities.RequiredResourceRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.RequiredResource;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the RequiredResource entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RequiredResourceRepository extends BaseRepositoryQuery<RequiredResource, Long>, RequiredResourceRepositoryQuery {

}
