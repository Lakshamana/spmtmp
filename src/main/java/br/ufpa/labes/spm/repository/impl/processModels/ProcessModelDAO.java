package br.ufpa.labes.spm.repository.impl.processModels;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processModels.IProcessModelDAO;
import br.ufpa.labes.spm.domain.ProcessModel;

public class ProcessModelDAO extends BaseRepositoryQueryImpl<ProcessModel, Long> implements IProcessModelDAO {

  protected ProcessModelDAO(Class<ProcessModel> businessClass) {
    super(businessClass);
  }

  public ProcessModelDAO() {
    super(ProcessModel.class);
  }
}
