package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IParameterDAO;
import br.ufpa.labes.spm.domain.Parameter;

public class ParameterDAO extends BaseRepositoryQueryImpl<Parameter, Long> implements IParameterDAO {

  protected ParameterDAO(Class<Parameter> businessClass) {
    super(businessClass);
  }

  public ParameterDAO() {
    super(Parameter.class);
  }
}
