package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IActivityInstantiatedRepositoryQuery;
import br.ufpa.labes.spm.domain.ActivityInstantiated;

public class ActivityInstantiatedRepositoryQuery extends BaseRepositoryQueryImpl<ActivityInstantiated, Long>
    implements IActivityInstantiatedRepositoryQuery {

  protected ActivityInstantiatedRepositoryQuery(Class<ActivityInstantiated> businessClass) {
    super(businessClass);
  }

  public ActivityInstantiatedRepositoryQuery() {
    super(ActivityInstantiated.class);
  }
}
