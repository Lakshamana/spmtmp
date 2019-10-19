package br.ufpa.labes.spm.repository.impl.tools;

import javax.lang.model.type.PrimitiveType;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IPrimitiveTypeRepositoryQuery;

public class PrimitiveTypeRepositoryQueryImpl extends BaseRepositoryQueryImpl<PrimitiveType, Long> implements IPrimitiveTypeRepositoryQuery {

  protected PrimitiveTypeRepositoryQueryImpl(Class<PrimitiveType> businessClass) {
    super(businessClass);
  }

  public PrimitiveTypeRepositoryQueryImpl() {
    super(PrimitiveType.class);
  }
}