package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IArtifactTypeDAO;
import br.ufpa.labes.spm.domain.ArtifactType;

public class ArtifactTypeDAO extends BaseRepositoryQueryImpl<ArtifactType, Long> implements IArtifactTypeDAO {

  protected ArtifactTypeDAO(Class<ArtifactType> businessClass) {
    super(businessClass);
  }

  public ArtifactTypeDAO() {
    super(ArtifactType.class);
  }
}
