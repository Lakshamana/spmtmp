package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IToolParameterRepositoryQuery;
import br.ufpa.labes.spm.domain.ToolParameter;

public class ToolParameterRepositoryQueryImpl extends BaseRepositoryQueryImpl<ToolParameter, Long> implements IToolParameterRepositoryQuery {

  protected ToolParameterRepositoryQueryImpl(Class<ToolParameter> businessClass) {
    super(businessClass);
  }

  public ToolParameterRepositoryQueryImpl() {
    super(ToolParameter.class);
  }
}
