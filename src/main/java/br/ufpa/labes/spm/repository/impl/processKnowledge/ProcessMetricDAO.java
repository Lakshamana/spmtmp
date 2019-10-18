package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IProcessMetricDAO;
import br.ufpa.labes.spm.domain.ProcessMetric;

public class ProcessMetricDAO extends BaseDAOImpl<ProcessMetric, Long> implements IProcessMetricDAO {

  protected ProcessMetricDAO(Class<ProcessMetric> businessClass) {
    super(businessClass);
  }

  public ProcessMetricDAO() {
    super(ProcessMetric.class);
  }
}
