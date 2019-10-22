package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.resources.ShareableRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Shareable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Shareable entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ShareableRepository extends JpaRepository<Shareable, Long> {

}
