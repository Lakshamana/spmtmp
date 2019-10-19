package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IToolDefinitionRepositoryQuery;
import br.ufpa.labes.spm.domain.ToolDefinition;

public class ToolDefinitionRepositoryQueryImpl extends BaseRepositoryQueryImpl<ToolDefinition, Long>
    implements IToolDefinitionRepositoryQuery {

  protected ToolDefinitionRepositoryQueryImpl(Class<ToolDefinition> businessClass) {
    super(businessClass);
  }

  public ToolDefinitionRepositoryQueryImpl() {
    super(ToolDefinition.class);
  }
}
