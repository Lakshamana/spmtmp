package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.tools.IPrimitiveTypeRepositoryQuery;


import br.ufpa.labes.spm.domain.PrimitiveType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PrimitiveType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PrimitiveTypeRepository extends IPrimitiveTypeRepositoryQuery, JpaRepository<PrimitiveType, Long> {

}
