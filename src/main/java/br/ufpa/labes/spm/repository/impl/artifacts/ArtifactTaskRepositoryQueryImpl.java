package br.ufpa.labes.spm.repository.impl.artifacts;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.artifacts.IArtifactTaskRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactTask;

public class ArtifactTaskRepositoryQueryImpl extends BaseRepositoryQueryImpl<ArtifactTask, Long> implements IArtifactTaskRepositoryQuery {

  protected ArtifactTaskRepositoryQueryImpl(Class<ArtifactTask> businessClass) {
    super(businessClass);
  }

  public ArtifactTaskRepositoryQueryImpl() {
    super(ArtifactTask.class);
  }
}
