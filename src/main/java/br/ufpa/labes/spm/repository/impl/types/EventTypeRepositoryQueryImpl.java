package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.EventTypeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.EventType;

public class EventTypeRepositoryQueryImpl extends BaseRepositoryQueryImpl<EventType, Long> implements EventTypeRepositoryQuery {

  protected EventTypeRepositoryQueryImpl(Class<EventType> businessClass) {
    super(businessClass);
  }

  public EventTypeRepositoryQueryImpl() {
    super(EventType.class);
  }
}
