package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IToolParameterRepositoryQuery;
import br.ufpa.labes.spm.domain.ToolParameter;

public class ToolParameterRepositoryQuery extends BaseRepositoryQueryImpl<ToolParameter, Long> implements IToolParameterRepositoryQuery {

  protected ToolParameterRepositoryQuery(Class<ToolParameter> businessClass) {
    super(businessClass);
  }

  public ToolParameterRepositoryQuery() {
    super(ToolParameter.class);
  }
}
