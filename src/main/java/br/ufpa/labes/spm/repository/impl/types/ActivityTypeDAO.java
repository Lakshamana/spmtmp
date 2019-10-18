package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IActivityTypeDAO;
import br.ufpa.labes.spm.domain.ActivityType;

public class ActivityTypeDAO extends BaseDAOImpl<ActivityType, Long> implements IActivityTypeDAO {

  protected ActivityTypeDAO(Class<ActivityType> businessClass) {
    super(businessClass);
  }

  public ActivityTypeDAO() {
    super(ActivityType.class);
  }
}
