package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.connections.BranchConCondToActivityRepositoryQuery;


import br.ufpa.labes.spm.domain.BranchConCondToActivity;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the BranchConCondToActivity entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BranchConCondToActivityRepository extends BranchConCondToActivityRepositoryQuery, JpaRepository<BranchConCondToActivity, Long> {

}
