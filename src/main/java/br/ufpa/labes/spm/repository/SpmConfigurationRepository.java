package br.ufpa.labes.spm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufpa.labes.spm.domain.SpmConfiguration;
import br.ufpa.labes.spm.repository.interfaces.agent.SpmConfigurationRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


/**
 * Spring Data  repository for the SpmConfiguration entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SpmConfigurationRepository extends BaseRepositoryQuery<SpmConfiguration, Long> {

}
