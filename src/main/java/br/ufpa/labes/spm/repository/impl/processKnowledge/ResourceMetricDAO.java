package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IResourceMetricDAO;
import br.ufpa.labes.spm.domain.ResourceMetric;

public class ResourceMetricDAO extends BaseDAOImpl<ResourceMetric, Long>
    implements IResourceMetricDAO {

  protected ResourceMetricDAO(Class<ResourceMetric> businessClass) {
    super(businessClass);
  }

  public ResourceMetricDAO() {
    super(ResourceMetric.class);
  }
}
