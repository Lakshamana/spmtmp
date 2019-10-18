package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IEstimationDAO;
import br.ufpa.labes.spm.domain.Estimation;

public class EstimationDAO extends BaseRepositoryQueryImpl<Estimation, Long> implements IEstimationDAO {

  protected EstimationDAO(Class<Estimation> businessClass) {
    super(businessClass);
  }

  public EstimationDAO() {
    super(Estimation.class);
  }
}
