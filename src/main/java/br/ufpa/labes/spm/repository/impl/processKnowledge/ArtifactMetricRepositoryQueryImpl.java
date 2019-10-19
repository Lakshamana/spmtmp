package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IArtifactMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactMetric;

public class ArtifactMetricRepositoryQueryImpl extends BaseRepositoryQueryImpl<ArtifactMetric, Long>
    implements IArtifactMetricRepositoryQuery {

  protected ArtifactMetricRepositoryQueryImpl(Class<ArtifactMetric> businessClass) {
    super(businessClass);
  }

  public ArtifactMetricRepositoryQueryImpl() {
    super(ArtifactMetric.class);
  }
}