package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.tools.ToolParameterRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.ToolParameter;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ToolParameter entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ToolParameterRepository extends BaseRepositoryQuery<ToolParameter, Long> {

}
