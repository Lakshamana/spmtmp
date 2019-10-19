package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IEventRepositoryQuery;
import br.ufpa.labes.spm.domain.Event;

public class EventRepositoryQueryImpl extends BaseRepositoryQueryImpl<Event, Long> implements IEventRepositoryQuery {

  protected EventRepositoryQueryImpl(Class<Event> businessClass) {
    super(businessClass);
  }

  public EventRepositoryQueryImpl() {
    super(Event.class);
  }
}
