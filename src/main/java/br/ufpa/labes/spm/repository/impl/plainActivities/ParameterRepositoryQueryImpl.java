package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IParameterRepositoryQuery;
import br.ufpa.labes.spm.domain.Parameter;

public class ParameterRepositoryQueryImpl extends BaseRepositoryQueryImpl<Parameter, Long> implements IParameterRepositoryQuery {

  protected ParameterRepositoryQueryImpl(Class<Parameter> businessClass) {
    super(businessClass);
  }

  public ParameterRepositoryQueryImpl() {
    super(Parameter.class);
  }
}
