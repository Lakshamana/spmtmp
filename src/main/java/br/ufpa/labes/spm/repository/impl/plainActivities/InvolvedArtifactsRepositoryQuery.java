package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IInvolvedArtifactsRepositoryQuery;
import br.ufpa.labes.spm.domain.InvolvedArtifact;

public class InvolvedArtifactsRepositoryQuery extends BaseRepositoryQueryImpl<InvolvedArtifact, Long>
    implements IInvolvedArtifactsRepositoryQuery {

  protected InvolvedArtifactsRepositoryQuery(Class<InvolvedArtifact> businessClass) {
    super(businessClass);
  }

  public InvolvedArtifactsRepositoryQuery() {
    super(InvolvedArtifact.class);
  }
}
