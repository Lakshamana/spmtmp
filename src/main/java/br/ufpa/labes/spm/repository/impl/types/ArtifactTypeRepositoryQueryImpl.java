package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IArtifactTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactType;

public class ArtifactTypeRepositoryQueryImpl extends BaseRepositoryQueryImpl<ArtifactType, Long> implements IArtifactTypeRepositoryQuery {

  protected ArtifactTypeRepositoryQueryImpl(Class<ArtifactType> businessClass) {
    super(businessClass);
  }

  public ArtifactTypeRepositoryQueryImpl() {
    super(ArtifactType.class);
  }
}
