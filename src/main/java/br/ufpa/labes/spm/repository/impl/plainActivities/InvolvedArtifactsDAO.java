package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IInvolvedArtifactsDAO;
import br.ufpa.labes.spm.domain.InvolvedArtifact;

public class InvolvedArtifactsDAO extends BaseDAOImpl<InvolvedArtifact, Long>
    implements IInvolvedArtifactsDAO {

  protected InvolvedArtifactsDAO(Class<InvolvedArtifact> businessClass) {
    super(businessClass);
  }

  public InvolvedArtifactsDAO() {
    super(InvolvedArtifact.class);
  }
}
