package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.connections.DependencyRepositoryQuery;


import br.ufpa.labes.spm.domain.Dependency;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Dependency entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DependencyRepository extends DependencyRepositoryQuery, JpaRepository<Dependency, Long> {

}
