package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IActivityMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.ActivityMetric;

public class ActivityMetricRepositoryQuery extends BaseRepositoryQueryImpl<ActivityMetric, Long>
    implements IActivityMetricRepositoryQuery {

  protected ActivityMetricRepositoryQuery(Class<ActivityMetric> businessClass) {
    super(businessClass);
  }

  public ActivityMetricRepositoryQuery() {
    super(ActivityMetric.class);
  }
}
