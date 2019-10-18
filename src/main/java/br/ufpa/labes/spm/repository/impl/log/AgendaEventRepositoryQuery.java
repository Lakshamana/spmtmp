package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IAgendaEventRepositoryQuery;
import br.ufpa.labes.spm.domain.AgendaEvent;

public class AgendaEventRepositoryQuery extends BaseRepositoryQueryImpl<AgendaEvent, Long> implements IAgendaEventRepositoryQuery {

  protected AgendaEventRepositoryQuery(Class<AgendaEvent> businessClass) {
    super(businessClass);
  }

  public AgendaEventRepositoryQuery() {
    super(AgendaEvent.class);
  }
}
