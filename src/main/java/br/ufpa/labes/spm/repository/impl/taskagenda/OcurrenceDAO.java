package br.ufpa.labes.spm.repository.impl.taskagenda;

import br.ufpa.labes.spm.repository.impl.BaseDAO;
import br.ufpa.labes.spm.repository.interfaces.taskagenda.IOcurrenceDAO;
import br.ufpa.labes.spm.domain.Ocurrence;

public class OcurrenceDAO extends BaseDAO<Ocurrence, Integer> implements IOcurrenceDAO {

  protected OcurrenceDAO(Class<Ocurrence> businessClass) {
    super(businessClass);
  }

  public OcurrenceDAO() {
    super(Ocurrence.class);
  }
}
