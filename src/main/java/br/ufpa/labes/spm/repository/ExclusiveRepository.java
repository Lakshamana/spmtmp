package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.resources.ExclusiveRepositoryQuery;


import br.ufpa.labes.spm.domain.Exclusive;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Exclusive entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ExclusiveRepository extends ExclusiveRepositoryQuery, JpaRepository<Exclusive, Long> {

}
