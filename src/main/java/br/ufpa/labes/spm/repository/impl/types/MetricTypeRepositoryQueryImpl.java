package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.MetricTypeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.MetricType;

public class MetricTypeRepositoryQueryImpl extends BaseRepositoryQueryImpl<MetricType, Long> implements MetricTypeRepositoryQuery {

  protected MetricTypeRepositoryQueryImpl(Class<MetricType> businessClass) {
    super(businessClass);
  }

  public MetricTypeRepositoryQueryImpl() {
    super(MetricType.class);
  }
}
