package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.OutOfWorkPeriodRepositoryQuery;
import br.ufpa.labes.spm.domain.OutOfWorkPeriod;

public class OutOfWorkPeriodRepositoryQueryImpl extends BaseRepositoryQueryImpl<OutOfWorkPeriod, Long>
    implements OutOfWorkPeriodRepositoryQuery{

  protected OutOfWorkPeriodRepositoryQueryImpl(Class<OutOfWorkPeriod> businessClass) {
    super(businessClass);
  }

  public OutOfWorkPeriodRepositoryQueryImpl() {
    super(OutOfWorkPeriod.class);
  }
}
