package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.domain.SpmConfiguration;
import br.ufpa.labes.spm.repository.interfaces.agent.ConfiRepositoryQuery;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the SpmConfiguration entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SpmConfigurationRepository extends ConfiRepositoryQuery, JpaRepository<SpmConfiguration, Long> {

}
