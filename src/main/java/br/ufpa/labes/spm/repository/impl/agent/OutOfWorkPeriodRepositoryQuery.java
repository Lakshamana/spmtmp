package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IOutOfWorkPeriodRepositoryQuery;
import br.ufpa.labes.spm.domain.OutOfWorkPeriod;

public class OutOfWorkPeriodRepositoryQuery extends BaseRepositoryQueryImpl<OutOfWorkPeriod, Long>
    implements IOutOfWorkPeriodRepositoryQuery {

  protected OutOfWorkPeriodRepositoryQuery(Class<OutOfWorkPeriod> businessClass) {
    super(businessClass);
  }

  public OutOfWorkPeriodRepositoryQuery() {
    super(OutOfWorkPeriod.class);
  }
}
