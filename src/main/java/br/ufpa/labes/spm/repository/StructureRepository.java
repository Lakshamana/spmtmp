package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.StructureRepositoryQuery;


import br.ufpa.labes.spm.domain.Structure;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Structure entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StructureRepository extends StructureRepositoryQuery, JpaRepository<Structure, Long> {

}
