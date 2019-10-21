package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.artifacts.ArtifactRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Artifact;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Artifact entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ArtifactRepository extends BaseRepositoryQuery<Artifact, Long> {

}
