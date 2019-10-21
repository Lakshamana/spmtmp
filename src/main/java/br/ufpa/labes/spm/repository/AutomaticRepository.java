package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.plainActivities.AutomaticRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Automatic;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Automatic entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AutomaticRepository extends BaseRepositoryQuery<Automatic, Long>, JpaRepository<Automatic, Long> {

}
