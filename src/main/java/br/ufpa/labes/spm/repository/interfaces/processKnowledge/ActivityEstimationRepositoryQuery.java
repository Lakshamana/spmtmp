package br.ufpa.labes.spm.repository.interfaces.processKnowledge;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ActivityEstimation;

public interface ActivityEstimationRepositoryQuery {
  public float getHoursEstimationForActivity(String normalIdent);
}
