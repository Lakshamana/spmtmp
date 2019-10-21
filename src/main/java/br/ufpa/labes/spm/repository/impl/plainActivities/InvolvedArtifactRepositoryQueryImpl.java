package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.InvolvedArtifactRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.InvolvedArtifact;

public class InvolvedArtifactRepositoryQueryImpl extends BaseRepositoryQueryImpl<InvolvedArtifact, Long>
    implements InvolvedArtifactRepositoryQuery {

  protected InvolvedArtifactRepositoryQueryImpl(Class<InvolvedArtifact> businessClass) {
    super(businessClass);
  }

  public InvolvedArtifactRepositoryQueryImpl() {
    super(InvolvedArtifact.class);
  }
}
