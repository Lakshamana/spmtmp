package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.plainActivities.EnactionDescriptionRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.EnactionDescription;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the EnactionDescription entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EnactionDescriptionRepository extends JpaRepository<EnactionDescription, Long> {

}
