package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.taskagenda.TaskRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Task;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Task entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TaskRepository extends BaseRepositoryQuery<Task, Long>, JpaRepository<Task, Long> {

}
