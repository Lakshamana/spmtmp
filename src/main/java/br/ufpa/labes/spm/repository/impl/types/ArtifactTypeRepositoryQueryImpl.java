package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.ArtifactTypeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactType;

public class ArtifactTypeRepositoryQueryImpl implements ArtifactTypeRepositoryQuery {

  protected ArtifactTypeRepositoryQueryImpl(Class<ArtifactType> businessClass) {
    super(businessClass);
  }

  public ArtifactTypeRepositoryQueryImpl() {
    super(ArtifactType.class);
  }
}
