package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IResourceMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.ResourceMetric;

public class ResourceMetricRepositoryQuery extends BaseRepositoryQueryImpl<ResourceMetric, Long>
    implements IResourceMetricRepositoryQuery {

  protected ResourceMetricRepositoryQuery(Class<ResourceMetric> businessClass) {
    super(businessClass);
  }

  public ResourceMetricRepositoryQuery() {
    super(ResourceMetric.class);
  }
}
