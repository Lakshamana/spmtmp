package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IParameterRepositoryQuery;
import br.ufpa.labes.spm.domain.Parameter;

public class ParameterRepositoryQuery extends BaseRepositoryQueryImpl<Parameter, Long> implements IParameterRepositoryQuery {

  protected ParameterRepositoryQuery(Class<Parameter> businessClass) {
    super(businessClass);
  }

  public ParameterRepositoryQuery() {
    super(Parameter.class);
  }
}
