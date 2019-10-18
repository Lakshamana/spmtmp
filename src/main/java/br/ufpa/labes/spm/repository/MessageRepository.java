package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.IMessageDAO;


import br.ufpa.labes.spm.domain.Message;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Message entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MessageRepository extends IMessageDAO, JpaRepository<Message, Long> {

}
