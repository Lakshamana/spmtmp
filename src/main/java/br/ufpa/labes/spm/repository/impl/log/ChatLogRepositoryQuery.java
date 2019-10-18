package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IChatLogRepositoryQuery;
import br.ufpa.labes.spm.domain.ChatLog;

public class ChatLogRepositoryQuery extends BaseRepositoryQueryImpl<ChatLog, Long> implements IChatLogRepositoryQuery {

  protected ChatLogRepositoryQuery(Class<ChatLog> businessClass) {
    super(businessClass);
  }

  public ChatLogRepositoryQuery() {
    super(ChatLog.class);
  }
}
