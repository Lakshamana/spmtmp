package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IWorkGroupTypeDAO;
import br.ufpa.labes.spm.domain.WorkGroupType;

public class WorkGroupTypeDAO extends BaseRepositoryQueryImpl<WorkGroupType, Long> implements IWorkGroupTypeDAO {

  protected WorkGroupTypeDAO(Class<WorkGroupType> businessClass) {
    super(businessClass);
  }

  public WorkGroupTypeDAO() {
    super(WorkGroupType.class);
  }
}
