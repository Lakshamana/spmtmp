package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.taskagenda.OcurrenceRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Ocurrence;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Ocurrence entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OcurrenceRepository extends BaseRepositoryQuery<Ocurrence, Long> {

}
