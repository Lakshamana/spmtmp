package br.ufpa.labes.spm.repository.impl.activities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.activities.IActivityDAO;
import br.ufpa.labes.spm.domain.Activity;

public class ActivityDAO extends BaseRepositoryQueryImpl<Activity, Long> implements IActivityDAO {

  public ActivityDAO(Class<Activity> businessClass) {
    super(businessClass);
  }

  public ActivityDAO() {
    super(Activity.class);
  }
}
