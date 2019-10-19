package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IArtifactEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactEstimation;

public class ArtifactEstimationRepositoryQueryImpl extends BaseRepositoryQueryImpl<ArtifactEstimation, Long>
    implements IArtifactEstimationRepositoryQuery {

  protected ArtifactEstimationRepositoryQueryImpl(Class<ArtifactEstimation> businessClass) {
    super(businessClass);
  }

  public ArtifactEstimationRepositoryQueryImpl() {
    super(ArtifactEstimation.class);
  }
}
