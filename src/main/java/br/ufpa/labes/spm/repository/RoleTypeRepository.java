package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.types.IRoleTypeRepositoryQuery;


import br.ufpa.labes.spm.domain.RoleType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the RoleType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RoleTypeRepository extends IRoleTypeRepositoryQuery, JpaRepository<RoleType, Long> {

}
