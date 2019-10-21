package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.MetricRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Metric;

public class MetricRepositoryQueryImpl extends BaseRepositoryQueryImpl<Metric, Long> implements MetricRepositoryQuery {

  protected MetricRepositoryQueryImpl(Class<Metric> businessClass) {
    super(businessClass);
  }

  public MetricRepositoryQueryImpl() {
    super(Metric.class);
  }
}
