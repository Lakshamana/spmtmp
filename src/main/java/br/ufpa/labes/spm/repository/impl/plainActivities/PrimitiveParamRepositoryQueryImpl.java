package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.PrimitiveParamRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.PrimitiveParam;

public class PrimitiveParamRepositoryQueryImpl extends BaseRepositoryQueryImpl<PrimitiveParam, Long>
    implements PrimitiveParamRepositoryQuery{

  protected PrimitiveParamRepositoryQueryImpl(Class<PrimitiveParam> businessClass) {
    super(businessClass);
  }

  public PrimitiveParamRepositoryQueryImpl() {
    super(PrimitiveParam.class);
  }
}
