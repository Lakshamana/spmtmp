package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.ToolParameterRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ToolParameter;

public class ToolParameterRepositoryQueryImpl implements ToolParameterRepositoryQuery {

  protected ToolParameterRepositoryQueryImpl(Class<ToolParameter> businessClass) {
    super(businessClass);
  }

  public ToolParameterRepositoryQueryImpl() {
    super(ToolParameter.class);
  }
}
