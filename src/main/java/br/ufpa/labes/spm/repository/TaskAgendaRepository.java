package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.taskagenda.TaskAgendaRepositoryQuery;


import br.ufpa.labes.spm.domain.TaskAgenda;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the TaskAgenda entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TaskAgendaRepository extends TaskAgendaRepositoryQuery, JpaRepository<TaskAgenda, Long> {

}
