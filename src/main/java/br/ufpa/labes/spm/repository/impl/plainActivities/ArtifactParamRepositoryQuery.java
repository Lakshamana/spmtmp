package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IArtifactParamRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactParam;

public class ArtifactParamRepositoryQuery extends BaseRepositoryQueryImpl<ArtifactParam, Long> implements IArtifactParamRepositoryQuery {

  protected ArtifactParamRepositoryQuery(Class<ArtifactParam> businessClass) {
    super(businessClass);
  }

  public ArtifactParamRepositoryQuery() {
    super(ArtifactParam.class);
  }
}
