package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.ArtifactParamRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactParam;

public class ArtifactParamRepositoryQueryImpl implements ArtifactParamRepositoryQuery {

  protected ArtifactParamRepositoryQueryImpl(Class<ArtifactParam> businessClass) {
    super(businessClass);
  }

  public ArtifactParamRepositoryQueryImpl() {
    super(ArtifactParam.class);
  }
}
