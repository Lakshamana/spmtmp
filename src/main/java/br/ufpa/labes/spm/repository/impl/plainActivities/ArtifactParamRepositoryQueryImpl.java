package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IArtifactParamRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactParam;

public class ArtifactParamRepositoryQueryImpl extends BaseRepositoryQueryImpl<ArtifactParam, Long> implements IArtifactParamRepositoryQuery {

  protected ArtifactParamRepositoryQueryImpl(Class<ArtifactParam> businessClass) {
    super(businessClass);
  }

  public ArtifactParamRepositoryQueryImpl() {
    super(ArtifactParam.class);
  }
}
