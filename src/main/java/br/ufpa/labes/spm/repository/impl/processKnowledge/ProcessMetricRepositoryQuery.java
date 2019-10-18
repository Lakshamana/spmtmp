package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IProcessMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.ProcessMetric;

public class ProcessMetricRepositoryQuery extends BaseRepositoryQueryImpl<ProcessMetric, Long> implements IProcessMetricRepositoryQuery {

  protected ProcessMetricRepositoryQuery(Class<ProcessMetric> businessClass) {
    super(businessClass);
  }

  public ProcessMetricRepositoryQuery() {
    super(ProcessMetric.class);
  }
}
