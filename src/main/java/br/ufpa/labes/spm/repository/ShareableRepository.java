package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.resources.IShareableRepositoryQuery;


import br.ufpa.labes.spm.domain.Shareable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Shareable entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ShareableRepository extends IShareableRepositoryQuery, JpaRepository<Shareable, Long> {

}
