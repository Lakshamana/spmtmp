package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IMetricDefinitionDAO;
import br.ufpa.labes.spm.domain.MetricDefinition;

public class MetricDefinitionDAO extends BaseRepositoryQueryImpl<MetricDefinition, Long>
    implements IMetricDefinitionDAO {

  protected MetricDefinitionDAO(Class<MetricDefinition> businessClass) {
    super(businessClass);
  }

  public MetricDefinitionDAO() {
    super(MetricDefinition.class);
  }
}
