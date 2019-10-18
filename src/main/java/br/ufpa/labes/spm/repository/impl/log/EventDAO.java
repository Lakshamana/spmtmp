package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IEventDAO;
import br.ufpa.labes.spm.domain.Event;

public class EventDAO extends BaseRepositoryQueryImpl<Event, Long> implements IEventDAO {

  protected EventDAO(Class<Event> businessClass) {
    super(businessClass);
  }

  public EventDAO() {
    super(Event.class);
  }
}
