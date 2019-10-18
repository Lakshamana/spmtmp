package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IWorkGroupRepositoryQuery;
import br.ufpa.labes.spm.domain.WorkGroup;

public class WorkGroupRepositoryQuery extends BaseRepositoryQueryImpl<WorkGroup, Long> implements IWorkGroupRepositoryQuery {

  protected WorkGroupRepositoryQuery(Class<WorkGroup> businessClass) {
    super(businessClass);
  }

  public WorkGroupRepositoryQuery() {
    super(WorkGroup.class);
  }
}
