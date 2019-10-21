package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.resources.ConsumableRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Consumable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Consumable entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConsumableRepository extends BaseRepositoryQuery<Consumable, Long>, JpaRepository<Consumable, Long> {

}
