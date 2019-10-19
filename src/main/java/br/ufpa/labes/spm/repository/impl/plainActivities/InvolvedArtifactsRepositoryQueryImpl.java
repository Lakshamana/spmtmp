package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.InvolvedArtifactsRepositoryQuery;
import br.ufpa.labes.spm.domain.InvolvedArtifact;

public class InvolvedArtifactsRepositoryQueryImpl extends BaseRepositoryQueryImpl<InvolvedArtifact, Long>
    implements nvolvedArtifactsRepositoryQuery{

  protected InvolvedArtifactsRepositoryQueryImpl(Class<InvolvedArtifact> businessClass) {
    super(businessClass);
  }

  public InvolvedArtifactsRepositoryQueryImpl() {
    super(InvolvedArtifact.class);
  }
}
