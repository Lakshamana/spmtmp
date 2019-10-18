package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.people.IOrganizationRepositoryQuery;


import br.ufpa.labes.spm.domain.Organization;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Organization entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OrganizationRepository extends IOrganizationRepositoryQuery, JpaRepository<Organization, Long> {

}
