package br.ufpa.labes.spm.repository.impl.chat;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.chat.ChatMessageRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ChatMessage;

public class MessageRepositoryQueryImpl implements MessageRepositoryQuery {

  protected MessageRepositoryQueryImpl(Class<ChatMessage> businessClass) {
    super(businessClass);
  }

  public MessageRepositoryQueryImpl() {
    super(ChatMessage.class);
  }
}
