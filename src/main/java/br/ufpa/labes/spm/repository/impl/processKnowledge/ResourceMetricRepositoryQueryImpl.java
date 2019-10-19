package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IResourceMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.ResourceMetric;

public class ResourceMetricRepositoryQueryImpl extends BaseRepositoryQueryImpl<ResourceMetric, Long>
    implements IResourceMetricRepositoryQuery {

  protected ResourceMetricRepositoryQueryImpl(Class<ResourceMetric> businessClass) {
    super(businessClass);
  }

  public ResourceMetricRepositoryQueryImpl() {
    super(ResourceMetric.class);
  }
}
