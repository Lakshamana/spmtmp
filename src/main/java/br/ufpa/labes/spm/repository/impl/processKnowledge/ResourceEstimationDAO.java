package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IResourceEstimationDAO;
import br.ufpa.labes.spm.domain.ResourceEstimation;

public class ResourceEstimationDAO extends BaseDAOImpl<ResourceEstimation, Long>
    implements IResourceEstimationDAO {

  protected ResourceEstimationDAO(Class<ResourceEstimation> businessClass) {
    super(businessClass);
  }

  public ResourceEstimationDAO() {
    super(ResourceEstimation.class);
  }
}
