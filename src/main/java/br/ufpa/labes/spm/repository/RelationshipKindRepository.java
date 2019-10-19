package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.assets.RelationshipKindRepositoryQuery;


import br.ufpa.labes.spm.domain.RelationshipKind;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the RelationshipKind entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RelationshipKindRepository extends RelationshipKindRepositoryQuery, JpaRepository<RelationshipKind, Long> {

}
