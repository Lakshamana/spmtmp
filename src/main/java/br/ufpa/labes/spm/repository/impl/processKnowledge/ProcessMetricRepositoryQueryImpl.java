package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.ProcessMetricRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ProcessMetric;

public class ProcessMetricRepositoryQueryImpl extends BaseRepositoryQueryImpl<ProcessMetric, Long> implements ProcessMetricRepositoryQuery {

  protected ProcessMetricRepositoryQueryImpl(Class<ProcessMetric> businessClass) {
    super(businessClass);
  }

  public ProcessMetricRepositoryQueryImpl() {
    super(ProcessMetric.class);
  }
}
