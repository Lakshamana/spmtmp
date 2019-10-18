package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IWorkGroupMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.WorkGroupMetric;

public class WorkGroupMetricRepositoryQuery extends BaseRepositoryQueryImpl<WorkGroupMetric, Long>
    implements IWorkGroupMetricRepositoryQuery {

  protected WorkGroupMetricRepositoryQuery(Class<WorkGroupMetric> businessClass) {
    super(businessClass);
  }

  public WorkGroupMetricRepositoryQuery() {
    super(WorkGroupMetric.class);
  }
}
