package br.ufpa.labes.spm.repository.impl.taskagenda;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.taskagenda.IOcurrenceRepositoryQuery;
import br.ufpa.labes.spm.domain.Ocurrence;

public class OcurrenceRepositoryQueryImpl extends BaseRepositoryQueryImpl<Ocurrence, Long> implements IOcurrenceRepositoryQuery {

  protected OcurrenceRepositoryQueryImpl(Class<Ocurrence> businessClass) {
    super(businessClass);
  }

  public OcurrenceRepositoryQueryImpl() {
    super(Ocurrence.class);
  }
}
