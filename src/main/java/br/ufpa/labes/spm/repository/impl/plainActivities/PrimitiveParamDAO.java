package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IPrimitiveParamDAO;
import br.ufpa.labes.spm.domain.PrimitiveParam;

public class PrimitiveParamDAO extends BaseRepositoryQueryImpl<PrimitiveParam, Long>
    implements IPrimitiveParamDAO {

  protected PrimitiveParamDAO(Class<PrimitiveParam> businessClass) {
    super(businessClass);
  }

  public PrimitiveParamDAO() {
    super(PrimitiveParam.class);
  }
}
