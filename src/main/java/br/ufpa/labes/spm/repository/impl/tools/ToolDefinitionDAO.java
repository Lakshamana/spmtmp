package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IToolDefinitionDAO;
import br.ufpa.labes.spm.domain.ToolDefinition;

public class ToolDefinitionDAO extends BaseRepositoryQueryImpl<ToolDefinition, Long>
    implements IToolDefinitionDAO {

  protected ToolDefinitionDAO(Class<ToolDefinition> businessClass) {
    super(businessClass);
  }

  public ToolDefinitionDAO() {
    super(ToolDefinition.class);
  }
}
