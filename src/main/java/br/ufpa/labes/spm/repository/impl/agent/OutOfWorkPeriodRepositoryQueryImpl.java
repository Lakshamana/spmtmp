package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IOutOfWorkPeriodRepositoryQuery;
import br.ufpa.labes.spm.domain.OutOfWorkPeriod;

public class OutOfWorkPeriodRepositoryQueryImpl extends BaseRepositoryQueryImpl<OutOfWorkPeriod, Long>
    implements IOutOfWorkPeriodRepositoryQuery {

  protected OutOfWorkPeriodRepositoryQueryImpl(Class<OutOfWorkPeriod> businessClass) {
    super(businessClass);
  }

  public OutOfWorkPeriodRepositoryQueryImpl() {
    super(OutOfWorkPeriod.class);
  }
}
