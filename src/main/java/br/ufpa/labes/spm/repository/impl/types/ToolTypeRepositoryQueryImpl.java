package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IToolTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.ToolType;

public class ToolTypeRepositoryQueryImpl extends BaseRepositoryQueryImpl<ToolType, Long> implements IToolTypeRepositoryQuery {

  protected ToolTypeRepositoryQueryImpl(Class<ToolType> businessClass) {
    super(businessClass);
  }

  public ToolTypeRepositoryQueryImpl() {
    super(ToolType.class);
  }
}
