package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IArtifactEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactEstimation;

public class ArtifactEstimationRepositoryQuery extends BaseRepositoryQueryImpl<ArtifactEstimation, Long>
    implements IArtifactEstimationRepositoryQuery {

  protected ArtifactEstimationRepositoryQuery(Class<ArtifactEstimation> businessClass) {
    super(businessClass);
  }

  public ArtifactEstimationRepositoryQuery() {
    super(ArtifactEstimation.class);
  }
}
