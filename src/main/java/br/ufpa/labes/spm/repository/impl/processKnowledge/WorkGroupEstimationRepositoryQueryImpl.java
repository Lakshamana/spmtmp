package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IWorkGroupEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.WorkGroupEstimation;

public class WorkGroupEstimationRepositoryQueryImpl extends BaseRepositoryQueryImpl<WorkGroupEstimation, Long>
    implements IWorkGroupEstimationRepositoryQuery {

  protected WorkGroupEstimationRepositoryQueryImpl(Class<WorkGroupEstimation> businessClass) {
    super(businessClass);
  }

  public WorkGroupEstimationRepositoryQueryImpl() {
    super(WorkGroupEstimation.class);
  }
}
