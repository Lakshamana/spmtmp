package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.ITypeDAO;
import br.ufpa.labes.spm.domain.Type;

public class TypeDAO extends BaseRepositoryQueryImpl<Type, Long> implements ITypeDAO {

  protected TypeDAO(Class<Type> businessClass) {
    super(businessClass);
  }

  public TypeDAO() {
    super(Type.class);
  }
}
