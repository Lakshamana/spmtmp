package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.ITypeRepositoryQuery;
import br.ufpa.labes.spm.domain.Type;

public class TypeRepositoryQuery extends BaseRepositoryQueryImpl<Type, Long> implements ITypeRepositoryQuery {

  protected TypeRepositoryQuery(Class<Type> businessClass) {
    super(businessClass);
  }

  public TypeRepositoryQuery() {
    super(Type.class);
  }
}
