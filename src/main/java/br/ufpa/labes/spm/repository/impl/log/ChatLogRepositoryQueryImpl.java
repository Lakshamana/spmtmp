package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.ChatLogRepositoryQuery;
import br.ufpa.labes.spm.domain.ChatLog;

public class ChatLogRepositoryQueryImpl extends BaseRepositoryQueryImpl<ChatLog, Long> implements ChatLogRepositoryQuery{

  protected ChatLogRepositoryQueryImpl(Class<ChatLog> businessClass) {
    super(businessClass);
  }

  public ChatLogRepositoryQueryImpl() {
    super(ChatLog.class);
  }
}
