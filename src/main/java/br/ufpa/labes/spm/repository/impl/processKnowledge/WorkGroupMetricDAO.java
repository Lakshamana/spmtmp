package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IWorkGroupMetricDAO;
import br.ufpa.labes.spm.domain.WorkGroupMetric;

public class WorkGroupMetricDAO extends BaseDAOImpl<WorkGroupMetric, Long>
    implements IWorkGroupMetricDAO {

  protected WorkGroupMetricDAO(Class<WorkGroupMetric> businessClass) {
    super(businessClass);
  }

  public WorkGroupMetricDAO() {
    super(WorkGroupMetric.class);
  }
}
