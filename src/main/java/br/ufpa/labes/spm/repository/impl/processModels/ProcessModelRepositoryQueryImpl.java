package br.ufpa.labes.spm.repository.impl.processModels;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processModels.IProcessModelRepositoryQuery;
import br.ufpa.labes.spm.domain.ProcessModel;

public class ProcessModelRepositoryQueryImpl extends BaseRepositoryQueryImpl<ProcessModel, Long> implements IProcessModelRepositoryQuery {

  protected ProcessModelRepositoryQueryImpl(Class<ProcessModel> businessClass) {
    super(businessClass);
  }

  public ProcessModelRepositoryQueryImpl() {
    super(ProcessModel.class);
  }
}
