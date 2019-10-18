package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.email.IEmailRepositoryQuery;


import br.ufpa.labes.spm.domain.Email;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Email entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmailRepository extends IEmailRepositoryQuery, JpaRepository<Email, Long> {

}
