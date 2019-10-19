package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IActivityInstantiatedRepositoryQuery;
import br.ufpa.labes.spm.domain.ActivityInstantiated;

public class ActivityInstantiatedRepositoryQueryImpl extends BaseRepositoryQueryImpl<ActivityInstantiated, Long>
    implements IActivityInstantiatedRepositoryQuery {

  protected ActivityInstantiatedRepositoryQueryImpl(Class<ActivityInstantiated> businessClass) {
    super(businessClass);
  }

  public ActivityInstantiatedRepositoryQueryImpl() {
    super(ActivityInstantiated.class);
  }
}
