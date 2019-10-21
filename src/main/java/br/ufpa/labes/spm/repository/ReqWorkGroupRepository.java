package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.plainActivities.ReqWorkGroupRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.ReqWorkGroup;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ReqWorkGroup entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ReqWorkGroupRepository extends BaseRepositoryQuery<ReqWorkGroup, Long> {

}
