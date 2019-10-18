package br.ufpa.labes.spm.repository.impl.tools;

import javax.lang.model.type.PrimitiveType;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IPrimitiveTypeRepositoryQuery;

public class PrimitiveTypeRepositoryQuery extends BaseRepositoryQueryImpl<PrimitiveType, Long> implements IPrimitiveTypeRepositoryQuery {

  protected PrimitiveTypeRepositoryQuery(Class<PrimitiveType> businessClass) {
    super(businessClass);
  }

  public PrimitiveTypeRepositoryQuery() {
    super(PrimitiveType.class);
  }
}
