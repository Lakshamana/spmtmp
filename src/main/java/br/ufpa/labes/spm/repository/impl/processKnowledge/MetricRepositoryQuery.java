package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.Metric;

public class MetricRepositoryQuery extends BaseRepositoryQueryImpl<Metric, Long> implements IMetricRepositoryQuery {

  protected MetricRepositoryQuery(Class<Metric> businessClass) {
    super(businessClass);
  }

  public MetricRepositoryQuery() {
    super(Metric.class);
  }
}
