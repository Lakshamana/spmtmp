package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.processModels.ProcessRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Process;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Process entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProcessRepository extends BaseRepositoryQuery<Process, Long>, ProcessRepositoryQuery {

}
