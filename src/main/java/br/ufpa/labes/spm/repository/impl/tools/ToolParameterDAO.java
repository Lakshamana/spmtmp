package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IToolParameterDAO;
import br.ufpa.labes.spm.domain.ToolParameter;

public class ToolParameterDAO extends BaseRepositoryQueryImpl<ToolParameter, Long> implements IToolParameterDAO {

  protected ToolParameterDAO(Class<ToolParameter> businessClass) {
    super(businessClass);
  }

  public ToolParameterDAO() {
    super(ToolParameter.class);
  }
}
