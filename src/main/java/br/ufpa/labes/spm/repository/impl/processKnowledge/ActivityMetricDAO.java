package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IActivityMetricDAO;
import br.ufpa.labes.spm.domain.ActivityMetric;

public class ActivityMetricDAO extends BaseDAOImpl<ActivityMetric, Long>
    implements IActivityMetricDAO {

  protected ActivityMetricDAO(Class<ActivityMetric> businessClass) {
    super(businessClass);
  }

  public ActivityMetricDAO() {
    super(ActivityMetric.class);
  }
}
