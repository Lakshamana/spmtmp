package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.connections.ISimpleConRepositoryQuery;


import br.ufpa.labes.spm.domain.SimpleCon;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the SimpleCon entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SimpleConRepository extends ISimpleConRepositoryQuery, JpaRepository<SimpleCon, Long> {

}
