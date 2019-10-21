package br.ufpa.labes.spm.repository.impl.chat;

import br.ufpa.labes.spm.domain.ChatMessage;
import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.chat.ChatMessageRepositoryQuery;

public class ChatMessageRepositoryQueryImpl extends BaseRepositoryQueryImpl<ChatMessage, Long> implements ChatMessageRepositoryQuery {

  protected ChatMessageRepositoryQueryImpl(Class<ChatMessage> businessClass) {
    super(businessClass);
  }

  public ChatMessageRepositoryQueryImpl() {
    super(ChatMessage.class);
  }
}
