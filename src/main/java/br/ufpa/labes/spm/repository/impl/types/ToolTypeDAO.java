package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IToolTypeDAO;
import br.ufpa.labes.spm.domain.ToolType;

public class ToolTypeDAO extends BaseDAOImpl<ToolType, Long> implements IToolTypeDAO {

  protected ToolTypeDAO(Class<ToolType> businessClass) {
    super(businessClass);
  }

  public ToolTypeDAO() {
    super(ToolType.class);
  }
}
