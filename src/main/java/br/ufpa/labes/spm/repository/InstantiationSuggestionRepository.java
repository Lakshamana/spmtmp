package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.plannerInfo.InstantiationSuggestionRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.InstantiationSuggestion;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the InstantiationSuggestion entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InstantiationSuggestionRepository extends BaseRepositoryQuery<InstantiationSuggestion, Long> {

}
