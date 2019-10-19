package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.ITypeRepositoryQuery;
import br.ufpa.labes.spm.domain.Type;

public class TypeRepositoryQueryImpl extends BaseRepositoryQueryImpl<Type, Long> implements ITypeRepositoryQuery {

  protected TypeRepositoryQueryImpl(Class<Type> businessClass) {
    super(businessClass);
  }

  public TypeRepositoryQueryImpl() {
    super(Type.class);
  }
}
