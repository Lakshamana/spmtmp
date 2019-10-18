package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IWorkGroupEstimationDAO;
import br.ufpa.labes.spm.domain.WorkGroupEstimation;

public class WorkGroupEstimationDAO extends BaseDAOImpl<WorkGroupEstimation, Long>
    implements IWorkGroupEstimationDAO {

  protected WorkGroupEstimationDAO(Class<WorkGroupEstimation> businessClass) {
    super(businessClass);
  }

  public WorkGroupEstimationDAO() {
    super(WorkGroupEstimation.class);
  }
}
