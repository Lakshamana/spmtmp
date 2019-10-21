package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.domain.Message;
import br.ufpa.labes.spm.repository.interfaces.chat.ChatMessageRepositoryQuery;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Message entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MessageRepository extends JpaRepository<Message, Long>, ChatMessageRepositoryQuery  {

}
