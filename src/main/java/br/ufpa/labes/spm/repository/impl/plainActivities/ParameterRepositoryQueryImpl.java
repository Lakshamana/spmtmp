package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.ParameterRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Parameter;

public class ParameterRepositoryQueryImpl extends BaseRepositoryQueryImpl<Parameter, Long> implements ParameterRepositoryQuery {

  protected ParameterRepositoryQueryImpl(Class<Parameter> businessClass) {
    super(businessClass);
  }

  public ParameterRepositoryQueryImpl() {
    super(Parameter.class);
  }
}
