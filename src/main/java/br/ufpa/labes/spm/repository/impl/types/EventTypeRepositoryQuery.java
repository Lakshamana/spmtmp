package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IEventTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.EventType;

public class EventTypeRepositoryQuery extends BaseRepositoryQueryImpl<EventType, Long> implements IEventTypeRepositoryQuery {

  protected EventTypeRepositoryQuery(Class<EventType> businessClass) {
    super(businessClass);
  }

  public EventTypeRepositoryQuery() {
    super(EventType.class);
  }
}
