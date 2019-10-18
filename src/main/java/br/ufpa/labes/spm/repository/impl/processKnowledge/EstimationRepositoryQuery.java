package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.Estimation;

public class EstimationRepositoryQuery extends BaseRepositoryQueryImpl<Estimation, Long> implements IEstimationRepositoryQuery {

  protected EstimationRepositoryQuery(Class<Estimation> businessClass) {
    super(businessClass);
  }

  public EstimationRepositoryQuery() {
    super(Estimation.class);
  }
}
