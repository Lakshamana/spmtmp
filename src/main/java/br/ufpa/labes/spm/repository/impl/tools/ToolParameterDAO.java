package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IToolParameterDAO;
import br.ufpa.labes.spm.domain.ToolParameter;

public class ToolParameterDAO extends BaseDAOImpl<ToolParameter, Long> implements IToolParameterDAO {

  protected ToolParameterDAO(Class<ToolParameter> businessClass) {
    super(businessClass);
  }

  public ToolParameterDAO() {
    super(ToolParameter.class);
  }
}
