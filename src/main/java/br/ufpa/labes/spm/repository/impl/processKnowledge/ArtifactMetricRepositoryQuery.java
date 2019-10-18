package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IArtifactMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.ArtifactMetric;

public class ArtifactMetricRepositoryQuery extends BaseRepositoryQueryImpl<ArtifactMetric, Long>
    implements IArtifactMetricRepositoryQuery {

  protected ArtifactMetricRepositoryQuery(Class<ArtifactMetric> businessClass) {
    super(businessClass);
  }

  public ArtifactMetricRepositoryQuery() {
    super(ArtifactMetric.class);
  }
}
