package br.ufpa.labes.spm.repository.impl.processModels;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processModels.IProcessModelRepositoryQuery;
import br.ufpa.labes.spm.domain.ProcessModel;

public class ProcessModelRepositoryQuery extends BaseRepositoryQueryImpl<ProcessModel, Long> implements IProcessModelRepositoryQuery {

  protected ProcessModelRepositoryQuery(Class<ProcessModel> businessClass) {
    super(businessClass);
  }

  public ProcessModelRepositoryQuery() {
    super(ProcessModel.class);
  }
}
