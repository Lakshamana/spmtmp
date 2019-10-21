package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.connections.ConnectionRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Connection;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Connection entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConnectionRepository extends BaseRepositoryQuery<Connection, Long> {

}
