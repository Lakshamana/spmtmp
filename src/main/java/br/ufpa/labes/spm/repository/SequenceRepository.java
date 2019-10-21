package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.connections.SequenceRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Sequence;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Sequence entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SequenceRepository extends BaseRepositoryQuery<Sequence, Long>, JpaRepository<Sequence, Long> {

}
