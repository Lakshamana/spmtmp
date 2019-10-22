package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.plainActivities.ParameterRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Parameter;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Parameter entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ParameterRepository extends JpaRepository<Parameter, Long> {

}
