package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IActivityTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.ActivityType;

public class ActivityTypeRepositoryQuery extends BaseRepositoryQueryImpl<ActivityType, Long> implements IActivityTypeRepositoryQuery {

  protected ActivityTypeRepositoryQuery(Class<ActivityType> businessClass) {
    super(businessClass);
  }

  public ActivityTypeRepositoryQuery() {
    super(ActivityType.class);
  }
}
