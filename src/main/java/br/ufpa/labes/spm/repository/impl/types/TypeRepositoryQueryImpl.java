package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.TypeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Type;

public class TypeRepositoryQueryImpl extends BaseRepositoryQueryImpl<Type, Long> implements TypeRepositoryQuery {

  protected TypeRepositoryQueryImpl(Class<Type> businessClass) {
    super(businessClass);
  }

  public TypeRepositoryQueryImpl() {
    super(Type.class);
  }
}
