package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IAgendaEventRepositoryQuery;
import br.ufpa.labes.spm.domain.AgendaEvent;

public class AgendaEventRepositoryQueryImpl extends BaseRepositoryQueryImpl<AgendaEvent, Long> implements IAgendaEventRepositoryQuery {

  protected AgendaEventRepositoryQueryImpl(Class<AgendaEvent> businessClass) {
    super(businessClass);
  }

  public AgendaEventRepositoryQueryImpl() {
    super(AgendaEvent.class);
  }
}
