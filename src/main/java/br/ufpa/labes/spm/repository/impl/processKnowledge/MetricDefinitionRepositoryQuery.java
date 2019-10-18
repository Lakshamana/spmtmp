package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IMetricDefinitionRepositoryQuery;
import br.ufpa.labes.spm.domain.MetricDefinition;

public class MetricDefinitionRepositoryQuery extends BaseRepositoryQueryImpl<MetricDefinition, Long>
    implements IMetricDefinitionRepositoryQuery {

  protected MetricDefinitionRepositoryQuery(Class<MetricDefinition> businessClass) {
    super(businessClass);
  }

  public MetricDefinitionRepositoryQuery() {
    super(MetricDefinition.class);
  }
}
