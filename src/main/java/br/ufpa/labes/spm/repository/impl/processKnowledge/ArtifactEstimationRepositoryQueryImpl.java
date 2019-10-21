package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.ArtifactEstimationRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactEstimation;

public class ArtifactEstimationRepositoryQueryImpl extends BaseRepositoryQueryImpl<ArtifactEstimation, Long>
    implements ArtifactEstimationRepositoryQuery{

  protected ArtifactEstimationRepositoryQueryImpl(Class<ArtifactEstimation> businessClass) {
    super(businessClass);
  }

  public ArtifactEstimationRepositoryQueryImpl() {
    super(ArtifactEstimation.class);
  }
}
