package br.ufpa.labes.spm.repository.impl.taskagenda;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.taskagenda.OcurrenceRepositoryQuery;
import br.ufpa.labes.spm.domain.Ocurrence;

public class OcurrenceRepositoryQueryImpl implements OcurrenceRepositoryQuery{

  protected OcurrenceRepositoryQueryImpl(Class<Ocurrence> businessClass) {
    super(businessClass);
  }

  public OcurrenceRepositoryQueryImpl() {
    super(Ocurrence.class);
  }
}
