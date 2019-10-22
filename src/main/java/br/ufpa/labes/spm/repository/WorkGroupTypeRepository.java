package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.types.WorkGroupTypeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.WorkGroupType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the WorkGroupType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface WorkGroupTypeRepository extends JpaRepository<WorkGroupType, Long> {

}
