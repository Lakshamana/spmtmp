package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.assets.TagStatsRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.TagStats;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the TagStats entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TagStatsRepository extends BaseRepositoryQuery<TagStats, Long> {

}
