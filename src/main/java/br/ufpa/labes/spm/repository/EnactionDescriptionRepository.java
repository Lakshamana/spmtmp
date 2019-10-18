package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.plainActivities.IEnactionDescriptionRepositoryQuery;


import br.ufpa.labes.spm.domain.EnactionDescription;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the EnactionDescription entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EnactionDescriptionRepository extends IEnactionDescriptionRepositoryQuery, JpaRepository<EnactionDescription, Long> {

}
