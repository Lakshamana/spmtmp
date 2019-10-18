package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IMetricTypeDAO;
import br.ufpa.labes.spm.domain.MetricType;

public class MetricTypeDAO extends BaseRepositoryQueryImpl<MetricType, Long> implements IMetricTypeDAO {

  protected MetricTypeDAO(Class<MetricType> businessClass) {
    super(businessClass);
  }

  public MetricTypeDAO() {
    super(MetricType.class);
  }
}
