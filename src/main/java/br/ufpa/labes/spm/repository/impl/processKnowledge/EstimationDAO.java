package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IEstimationDAO;
import br.ufpa.labes.spm.domain.Estimation;

public class EstimationDAO extends BaseDAOImpl<Estimation, Long> implements IEstimationDAO {

  protected EstimationDAO(Class<Estimation> businessClass) {
    super(businessClass);
  }

  public EstimationDAO() {
    super(Estimation.class);
  }
}
