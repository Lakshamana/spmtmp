package br.ufpa.labes.spm.repository.interfaces.processKnowledge;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ActivityEstimation;

public interface IActivityEstimationRepositoryQuery extends BaseRepositoryQuery<ActivityEstimation, Long> {
  public float getHoursEstimationForActivity(String normalIdent);
}