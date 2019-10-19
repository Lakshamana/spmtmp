package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IActivityMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.ActivityMetric;

public class ActivityMetricRepositoryQueryImpl extends BaseRepositoryQueryImpl<ActivityMetric, Long>
    implements IActivityMetricRepositoryQuery {

  protected ActivityMetricRepositoryQueryImpl(Class<ActivityMetric> businessClass) {
    super(businessClass);
  }

  public ActivityMetricRepositoryQueryImpl() {
    super(ActivityMetric.class);
  }
}
