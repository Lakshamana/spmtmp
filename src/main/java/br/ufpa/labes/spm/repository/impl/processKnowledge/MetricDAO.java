package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IMetricDAO;
import br.ufpa.labes.spm.domain.Metric;

public class MetricDAO extends BaseDAOImpl<Metric, Long> implements IMetricDAO {

  protected MetricDAO(Class<Metric> businessClass) {
    super(businessClass);
  }

  public MetricDAO() {
    super(Metric.class);
  }
}
