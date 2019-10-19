package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IProcessMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.ProcessMetric;

public class ProcessMetricRepositoryQueryImpl extends BaseRepositoryQueryImpl<ProcessMetric, Long> implements IProcessMetricRepositoryQuery {

  protected ProcessMetricRepositoryQueryImpl(Class<ProcessMetric> businessClass) {
    super(businessClass);
  }

  public ProcessMetricRepositoryQueryImpl() {
    super(ProcessMetric.class);
  }
}
