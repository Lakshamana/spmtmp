package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.WorkGroupMetricRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.WorkGroupMetric;

public class WorkGroupMetricRepositoryQueryImpl extends BaseRepositoryQueryImpl<WorkGroupMetric, Long>
    implements WorkGroupMetricRepositoryQuery{

  protected WorkGroupMetricRepositoryQueryImpl(Class<WorkGroupMetric> businessClass) {
    super(businessClass);
  }

  public WorkGroupMetricRepositoryQueryImpl() {
    super(WorkGroupMetric.class);
  }
}
