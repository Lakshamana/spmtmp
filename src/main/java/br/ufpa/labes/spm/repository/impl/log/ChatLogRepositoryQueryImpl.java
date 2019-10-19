package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IChatLogRepositoryQuery;
import br.ufpa.labes.spm.domain.ChatLog;

public class ChatLogRepositoryQueryImpl extends BaseRepositoryQueryImpl<ChatLog, Long> implements IChatLogRepositoryQuery {

  protected ChatLogRepositoryQueryImpl(Class<ChatLog> businessClass) {
    super(businessClass);
  }

  public ChatLogRepositoryQueryImpl() {
    super(ChatLog.class);
  }
}
