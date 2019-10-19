package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.EventRepositoryQuery;
import br.ufpa.labes.spm.domain.Event;

public class EventRepositoryQueryImpl extends BaseRepositoryQueryImpl<Event, Long> implements EventRepositoryQuery{

  protected EventRepositoryQueryImpl(Class<Event> businessClass) {
    super(businessClass);
  }

  public EventRepositoryQueryImpl() {
    super(Event.class);
  }
}
