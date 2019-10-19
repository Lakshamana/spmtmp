package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IMetricDefinitionRepositoryQuery;
import br.ufpa.labes.spm.domain.MetricDefinition;

public class MetricDefinitionRepositoryQueryImpl extends BaseRepositoryQueryImpl<MetricDefinition, Long>
    implements IMetricDefinitionRepositoryQuery {

  protected MetricDefinitionRepositoryQueryImpl(Class<MetricDefinition> businessClass) {
    super(businessClass);
  }

  public MetricDefinitionRepositoryQueryImpl() {
    super(MetricDefinition.class);
  }
}
