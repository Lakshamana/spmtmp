package br.ufpa.labes.spm.repository.impl.tools;

import javax.lang.model.type.PrimitiveType;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.PrimitiveTypeRepositoryQuery;

public class PrimitiveTypeRepositoryQueryImpl implements PrimitiveTypeRepositoryQuery{

  protected PrimitiveTypeRepositoryQueryImpl(Class<PrimitiveType> businessClass) {
    super(businessClass);
  }

  public PrimitiveTypeRepositoryQueryImpl() {
    super(PrimitiveType.class);
  }
}
