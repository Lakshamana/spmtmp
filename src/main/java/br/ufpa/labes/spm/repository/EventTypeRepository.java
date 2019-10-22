package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.types.EventTypeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.EventType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the EventType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EventTypeRepository extends JpaRepository<EventType, Long> {

}
