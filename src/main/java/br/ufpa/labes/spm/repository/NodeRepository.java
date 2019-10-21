package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.NodeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Node;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Node entity.
 */
@SuppressWarnings("unused")
@Repository
public interface NodeRepository extends BaseRepositoryQuery<Node, Long>, JpaRepository<Node, Long> {

}
