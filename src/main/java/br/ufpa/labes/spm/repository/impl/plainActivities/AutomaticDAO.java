package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IAutomaticDAO;
import br.ufpa.labes.spm.domain.Automatic;

public class AutomaticDAO extends BaseDAOImpl<Automatic, Long> implements IAutomaticDAO {

  protected AutomaticDAO(Class<Automatic> businessClass) {
    super(businessClass);
  }

  public AutomaticDAO() {
    super(Automatic.class);
  }
}
