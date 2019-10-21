package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.plainActivities.ReqAgentRequiresAbilityRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.ReqAgentRequiresAbility;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ReqAgentRequiresAbility entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ReqAgentRequiresAbilityRepository extends BaseRepositoryQuery<ReqAgentRequiresAbility, Long>, JpaRepository<ReqAgentRequiresAbility, Long> {

}
