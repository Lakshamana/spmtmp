package br.ufpa.labes.spm.repository.impl.artifacts;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.artifacts.IArtifactTaskDAO;
import br.ufpa.labes.spm.domain.ArtifactTask;

public class ArtifactTaskDAO extends BaseRepositoryQueryImpl<ArtifactTask, Long> implements IArtifactTaskDAO {

  protected ArtifactTaskDAO(Class<ArtifactTask> businessClass) {
    super(businessClass);
  }

  public ArtifactTaskDAO() {
    super(ArtifactTask.class);
  }
}
