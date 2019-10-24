package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.ActivityTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.ActivityType;

public class ActivityTypeRepositoryQueryImpl implements ActivityTypeRepositoryQuery{

  protected ActivityTypeRepositoryQueryImpl(Class<ActivityType> businessClass) {
    super(businessClass);
  }

  public ActivityTypeRepositoryQueryImpl() {
    super(ActivityType.class);
  }
}
