package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.types.ConnectionTypeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.ConnectionType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ConnectionType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConnectionTypeRepository extends JpaRepository<ConnectionType, Long> {

}
