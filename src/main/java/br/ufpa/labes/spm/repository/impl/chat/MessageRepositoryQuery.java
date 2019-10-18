package br.ufpa.labes.spm.repository.impl.chat;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.chat.IChatMessageRepositoryQuery;
import br.ufpa.labes.spm.domain.ChatMessage;

public class MessageRepositoryQuery extends BaseRepositoryQueryImpl<ChatMessage, Long> implements IChatMessageRepositoryQuery {

  protected MessageRepositoryQuery(Class<ChatMessage> businessClass) {
    super(businessClass);
  }

  public MessageRepositoryQuery() {
    super(ChatMessage.class);
  }
}
