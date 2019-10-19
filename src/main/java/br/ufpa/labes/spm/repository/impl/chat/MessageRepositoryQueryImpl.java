package br.ufpa.labes.spm.repository.impl.chat;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.chat.IChatMessageRepositoryQuery;
import br.ufpa.labes.spm.domain.ChatMessage;

public class MessageRepositoryQueryImpl extends BaseRepositoryQueryImpl<ChatMessage, Long> implements IChatMessageRepositoryQuery {

  protected MessageRepositoryQueryImpl(Class<ChatMessage> businessClass) {
    super(businessClass);
  }

  public MessageRepositoryQueryImpl() {
    super(ChatMessage.class);
  }
}
