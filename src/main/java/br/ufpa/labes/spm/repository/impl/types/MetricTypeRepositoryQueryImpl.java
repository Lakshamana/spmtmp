package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IMetricTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.MetricType;

public class MetricTypeRepositoryQueryImpl extends BaseRepositoryQueryImpl<MetricType, Long> implements IMetricTypeRepositoryQuery {

  protected MetricTypeRepositoryQueryImpl(Class<MetricType> businessClass) {
    super(businessClass);
  }

  public MetricTypeRepositoryQueryImpl() {
    super(MetricType.class);
  }
}
