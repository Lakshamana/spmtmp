package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.WorkGroupRepositoryQuery;
import br.ufpa.labes.spm.domain.WorkGroup;

public class WorkGroupRepositoryQueryImpl extends BaseRepositoryQueryImpl<WorkGroup, Long> implements WorkGroupRepositoryQuery{

  protected WorkGroupRepositoryQueryImpl(Class<WorkGroup> businessClass) {
    super(businessClass);
  }

  public WorkGroupRepositoryQueryImpl() {
    super(WorkGroup.class);
  }
}
