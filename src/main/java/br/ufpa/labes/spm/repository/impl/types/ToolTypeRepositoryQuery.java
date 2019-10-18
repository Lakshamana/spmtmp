package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IToolTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.ToolType;

public class ToolTypeRepositoryQuery extends BaseRepositoryQueryImpl<ToolType, Long> implements IToolTypeRepositoryQuery {

  protected ToolTypeRepositoryQuery(Class<ToolType> businessClass) {
    super(businessClass);
  }

  public ToolTypeRepositoryQuery() {
    super(ToolType.class);
  }
}
