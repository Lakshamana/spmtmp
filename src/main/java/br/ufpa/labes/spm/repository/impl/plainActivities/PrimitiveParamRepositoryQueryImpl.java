package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IPrimitiveParamRepositoryQuery;
import br.ufpa.labes.spm.domain.PrimitiveParam;

public class PrimitiveParamRepositoryQueryImpl extends BaseRepositoryQueryImpl<PrimitiveParam, Long>
    implements IPrimitiveParamRepositoryQuery {

  protected PrimitiveParamRepositoryQueryImpl(Class<PrimitiveParam> businessClass) {
    super(businessClass);
  }

  public PrimitiveParamRepositoryQueryImpl() {
    super(PrimitiveParam.class);
  }
}
