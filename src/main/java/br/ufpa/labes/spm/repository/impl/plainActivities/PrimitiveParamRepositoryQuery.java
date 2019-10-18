package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IPrimitiveParamRepositoryQuery;
import br.ufpa.labes.spm.domain.PrimitiveParam;

public class PrimitiveParamRepositoryQuery extends BaseRepositoryQueryImpl<PrimitiveParam, Long>
    implements IPrimitiveParamRepositoryQuery {

  protected PrimitiveParamRepositoryQuery(Class<PrimitiveParam> businessClass) {
    super(businessClass);
  }

  public PrimitiveParamRepositoryQuery() {
    super(PrimitiveParam.class);
  }
}
