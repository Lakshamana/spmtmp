package br.ufpa.labes.spm.repository.impl.activities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.activities.ActivityRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Activity;

public class ActivityRepositoryQueryImpl implements ActivityRepositoryQuery {

  public ActivityRepositoryQueryImpl(Class<Activity> businessClass) {
    super(businessClass);
  }

  public ActivityRepositoryQueryImpl() {
    super(Activity.class);
  }
}
