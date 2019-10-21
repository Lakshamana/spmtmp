package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.domain.ChatMessage;
import br.ufpa.labes.spm.repository.interfaces.chat.ChatMessageRepositoryQuery;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ChatMessage entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long>, ChatMessageRepositoryQuery  {

}
