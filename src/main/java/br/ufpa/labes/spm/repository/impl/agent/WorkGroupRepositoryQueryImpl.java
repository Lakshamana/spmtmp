package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.WorkGroupRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.WorkGroup;

public class WorkGroupRepositoryQueryImpl implements WorkGroupRepositoryQuery {

  protected WorkGroupRepositoryQueryImpl(Class<WorkGroup> businessClass) {
    super(businessClass);
  }

  public WorkGroupRepositoryQueryImpl() {
    super(WorkGroup.class);
  }
}
