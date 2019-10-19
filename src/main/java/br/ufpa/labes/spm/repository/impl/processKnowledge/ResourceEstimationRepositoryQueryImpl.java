package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IResourceEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.ResourceEstimation;

public class ResourceEstimationRepositoryQueryImpl extends BaseRepositoryQueryImpl<ResourceEstimation, Long>
    implements IResourceEstimationRepositoryQuery {

  protected ResourceEstimationRepositoryQueryImpl(Class<ResourceEstimation> businessClass) {
    super(businessClass);
  }

  public ResourceEstimationRepositoryQueryImpl() {
    super(ResourceEstimation.class);
  }
}
