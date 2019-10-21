package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.tools.ScriptRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Script;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Script entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ScriptRepository extends BaseRepositoryQuery<Script, Long> {

}
