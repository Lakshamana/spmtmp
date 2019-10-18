package br.ufpa.labes.spm.repository.impl.processModels;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.processModels.IProcessModelDAO;
import br.ufpa.labes.spm.domain.ProcessModel;

public class ProcessModelDAO extends BaseDAOImpl<ProcessModel, Long> implements IProcessModelDAO {

  protected ProcessModelDAO(Class<ProcessModel> businessClass) {
    super(businessClass);
  }

  public ProcessModelDAO() {
    super(ProcessModel.class);
  }
}
