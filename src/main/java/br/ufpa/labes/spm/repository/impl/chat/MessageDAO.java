package br.ufpa.labes.spm.repository.impl.chat;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.chat.IChatMessageDAO;
import br.ufpa.labes.spm.domain.ChatMessage;

public class MessageDAO extends BaseDAOImpl<ChatMessage, Long> implements IChatMessageDAO {

  protected MessageDAO(Class<ChatMessage> businessClass) {
    super(businessClass);
  }

  public MessageDAO() {
    super(ChatMessage.class);
  }
}
