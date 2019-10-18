package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IArtifactEstimationDAO;
import br.ufpa.labes.spm.domain.ArtifactEstimation;

public class ArtifactEstimationDAO extends BaseRepositoryQueryImpl<ArtifactEstimation, Long>
    implements IArtifactEstimationDAO {

  protected ArtifactEstimationDAO(Class<ArtifactEstimation> businessClass) {
    super(businessClass);
  }

  public ArtifactEstimationDAO() {
    super(ArtifactEstimation.class);
  }
}
