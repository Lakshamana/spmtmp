package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IResourceEstimationDAO;
import br.ufpa.labes.spm.domain.ResourceEstimation;

public class ResourceEstimationDAO extends BaseRepositoryQueryImpl<ResourceEstimation, Long>
    implements IResourceEstimationDAO {

  protected ResourceEstimationDAO(Class<ResourceEstimation> businessClass) {
    super(businessClass);
  }

  public ResourceEstimationDAO() {
    super(ResourceEstimation.class);
  }
}
