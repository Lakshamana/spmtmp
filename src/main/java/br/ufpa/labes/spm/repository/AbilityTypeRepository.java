package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.types.AbilityTypeRepositoryQuery;


import br.ufpa.labes.spm.domain.AbilityType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the AbilityType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AbilityTypeRepository extends AbilityTypeRepositoryQuery, JpaRepository<AbilityType, Long> {

}
