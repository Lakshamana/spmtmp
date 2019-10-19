package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.Estimation;

public class EstimationRepositoryQueryImpl extends BaseRepositoryQueryImpl<Estimation, Long> implements IEstimationRepositoryQuery {

  protected EstimationRepositoryQueryImpl(Class<Estimation> businessClass) {
    super(businessClass);
  }

  public EstimationRepositoryQueryImpl() {
    super(Estimation.class);
  }
}
