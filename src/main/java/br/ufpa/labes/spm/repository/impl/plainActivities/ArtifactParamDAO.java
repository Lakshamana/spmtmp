package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IArtifactParamDAO;
import br.ufpa.labes.spm.domain.ArtifactParam;

public class ArtifactParamDAO extends BaseDAOImpl<ArtifactParam, Long> implements IArtifactParamDAO {

  protected ArtifactParamDAO(Class<ArtifactParam> businessClass) {
    super(businessClass);
  }

  public ArtifactParamDAO() {
    super(ArtifactParam.class);
  }
}
