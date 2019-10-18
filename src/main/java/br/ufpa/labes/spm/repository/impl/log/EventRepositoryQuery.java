package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IEventRepositoryQuery;
import br.ufpa.labes.spm.domain.Event;

public class EventRepositoryQuery extends BaseRepositoryQueryImpl<Event, Long> implements IEventRepositoryQuery {

  protected EventRepositoryQuery(Class<Event> businessClass) {
    super(businessClass);
  }

  public EventRepositoryQuery() {
    super(Event.class);
  }
}
