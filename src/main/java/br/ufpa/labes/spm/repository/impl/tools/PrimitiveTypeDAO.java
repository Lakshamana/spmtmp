package br.ufpa.labes.spm.repository.impl.tools;

import javax.lang.model.type.PrimitiveType;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IPrimitiveTypeDAO;

public class PrimitiveTypeDAO extends BaseDAOImpl<PrimitiveType, Long> implements IPrimitiveTypeDAO {

  protected PrimitiveTypeDAO(Class<PrimitiveType> businessClass) {
    super(businessClass);
  }

  public PrimitiveTypeDAO() {
    super(PrimitiveType.class);
  }
}
