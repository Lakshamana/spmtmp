package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.ToolTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.ToolType;

public class ToolTypeRepositoryQueryImpl implements ToolTypeRepositoryQuery{

  protected ToolTypeRepositoryQueryImpl(Class<ToolType> businessClass) {
    super(businessClass);
  }

  public ToolTypeRepositoryQueryImpl() {
    super(ToolType.class);
  }
}
