package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.tools.ClassMethodCallRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.ClassMethodCall;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ClassMethodCall entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClassMethodCallRepository extends BaseRepositoryQuery<ClassMethodCall, Long>, JpaRepository<ClassMethodCall, Long> {

}
