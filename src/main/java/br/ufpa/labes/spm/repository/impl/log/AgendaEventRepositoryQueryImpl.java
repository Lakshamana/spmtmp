package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.AgendaEventRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.AgendaEvent;

public class AgendaEventRepositoryQueryImpl extends BaseRepositoryQueryImpl<AgendaEvent, Long> implements AgendaEventRepositoryQuery {

  protected AgendaEventRepositoryQueryImpl(Class<AgendaEvent> businessClass) {
    super(businessClass);
  }

  public AgendaEventRepositoryQueryImpl() {
    super(AgendaEvent.class);
  }
}
