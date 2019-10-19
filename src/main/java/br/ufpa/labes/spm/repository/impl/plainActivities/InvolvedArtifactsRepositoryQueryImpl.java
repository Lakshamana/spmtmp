package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IInvolvedArtifactsRepositoryQuery;
import br.ufpa.labes.spm.domain.InvolvedArtifact;

public class InvolvedArtifactsRepositoryQueryImpl extends BaseRepositoryQueryImpl<InvolvedArtifact, Long>
    implements IInvolvedArtifactsRepositoryQuery {

  protected InvolvedArtifactsRepositoryQueryImpl(Class<InvolvedArtifact> businessClass) {
    super(businessClass);
  }

  public InvolvedArtifactsRepositoryQueryImpl() {
    super(InvolvedArtifact.class);
  }
}
