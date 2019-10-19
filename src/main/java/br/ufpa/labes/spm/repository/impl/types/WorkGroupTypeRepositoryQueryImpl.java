package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IWorkGroupTypeRepositoryQuery;
import br.ufpa.labes.spm.domain.WorkGroupType;

public class WorkGroupTypeRepositoryQueryImpl extends BaseRepositoryQueryImpl<WorkGroupType, Long> implements IWorkGroupTypeRepositoryQuery {

  protected WorkGroupTypeRepositoryQueryImpl(Class<WorkGroupType> businessClass) {
    super(businessClass);
  }

  public WorkGroupTypeRepositoryQueryImpl() {
    super(WorkGroupType.class);
  }
}
