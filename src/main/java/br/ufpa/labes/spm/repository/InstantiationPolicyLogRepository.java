package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.plannerInfo.InstantiationPolicyLogRepositoryQuery;


import br.ufpa.labes.spm.domain.InstantiationPolicyLog;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the InstantiationPolicyLog entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InstantiationPolicyLogRepository extends InstantiationPolicyLogRepositoryQuery, JpaRepository<InstantiationPolicyLog, Long> {

}
