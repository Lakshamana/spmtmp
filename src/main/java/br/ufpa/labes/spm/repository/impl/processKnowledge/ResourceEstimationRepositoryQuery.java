package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IResourceEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.ResourceEstimation;

public class ResourceEstimationRepositoryQuery extends BaseRepositoryQueryImpl<ResourceEstimation, Long>
    implements IResourceEstimationRepositoryQuery {

  protected ResourceEstimationRepositoryQuery(Class<ResourceEstimation> businessClass) {
    super(businessClass);
  }

  public ResourceEstimationRepositoryQuery() {
    super(ResourceEstimation.class);
  }
}
