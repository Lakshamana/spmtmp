package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.connections.FeedbackRepositoryQuery;


import br.ufpa.labes.spm.domain.Feedback;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Feedback entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FeedbackRepository extends FeedbackRepositoryQuery, JpaRepository<Feedback, Long> {

}
