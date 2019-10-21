package br.ufpa.labes.spm.repository.impl.artifacts;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.artifacts.ArtifactTaskRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactTask;

public class ArtifactTaskRepositoryQueryImpl extends BaseRepositoryQueryImpl<ArtifactTask, Long> implements ArtifactTaskRepositoryQuery {

  protected ArtifactTaskRepositoryQueryImpl(Class<ArtifactTask> businessClass) {
    super(businessClass);
  }

  public ArtifactTaskRepositoryQueryImpl() {
    super(ArtifactTask.class);
  }
}
