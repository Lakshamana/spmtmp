package br.ufpa.labes.spm.repository.impl.taskagenda;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.taskagenda.IOcurrenceDAO;
import br.ufpa.labes.spm.domain.Ocurrence;

public class OcurrenceDAO extends BaseRepositoryQueryImpl<Ocurrence, Long> implements IOcurrenceDAO {

  protected OcurrenceDAO(Class<Ocurrence> businessClass) {
    super(businessClass);
  }

  public OcurrenceDAO() {
    super(Ocurrence.class);
  }
}
