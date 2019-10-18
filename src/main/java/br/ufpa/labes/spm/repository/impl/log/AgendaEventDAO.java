package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IAgendaEventDAO;
import br.ufpa.labes.spm.domain.AgendaEvent;

public class AgendaEventDAO extends BaseDAOImpl<AgendaEvent, Long> implements IAgendaEventDAO {

  protected AgendaEventDAO(Class<AgendaEvent> businessClass) {
    super(businessClass);
  }

  public AgendaEventDAO() {
    super(AgendaEvent.class);
  }
}
