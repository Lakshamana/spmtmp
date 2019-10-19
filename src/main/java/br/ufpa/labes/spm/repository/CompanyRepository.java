package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.CompanyRepositoryQuery;


import br.ufpa.labes.spm.domain.Company;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Company entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CompanyRepository extends CompanyRepositoryQuery, JpaRepository<Company, Long> {

}
