package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.agent.EmailConfigurationRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.EmailConfiguration;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the EmailConfiguration entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmailConfigurationRepository extends BaseRepositoryQuery<EmailConfiguration, Long>, JpaRepository<EmailConfiguration, Long> {

}
