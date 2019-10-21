package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.ToolDefinitionRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ToolDefinition;

public class ToolDefinitionRepositoryQueryImpl extends BaseRepositoryQueryImpl<ToolDefinition, Long>
    implements ToolDefinitionRepositoryQuery{

  protected ToolDefinitionRepositoryQueryImpl(Class<ToolDefinition> businessClass) {
    super(businessClass);
  }

  public ToolDefinitionRepositoryQueryImpl() {
    super(ToolDefinition.class);
  }
}
