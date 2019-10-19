package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.Metric;

public class MetricRepositoryQueryImpl extends BaseRepositoryQueryImpl<Metric, Long> implements IMetricRepositoryQuery {

  protected MetricRepositoryQueryImpl(Class<Metric> businessClass) {
    super(businessClass);
  }

  public MetricRepositoryQueryImpl() {
    super(Metric.class);
  }
}
