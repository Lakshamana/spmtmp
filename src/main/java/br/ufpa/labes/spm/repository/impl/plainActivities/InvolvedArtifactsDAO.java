package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IInvolvedArtifactsDAO;
import br.ufpa.labes.spm.domain.InvolvedArtifact;

public class InvolvedArtifactsDAO extends BaseRepositoryQueryImpl<InvolvedArtifact, Long>
    implements IInvolvedArtifactsDAO {

  protected InvolvedArtifactsDAO(Class<InvolvedArtifact> businessClass) {
    super(businessClass);
  }

  public InvolvedArtifactsDAO() {
    super(InvolvedArtifact.class);
  }
}
