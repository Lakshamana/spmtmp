package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.processModels.TemplateRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Template;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Template entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TemplateRepository extends BaseRepositoryQuery<Template, Long> {

}
