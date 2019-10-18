package br.ufpa.labes.spm.repository.interfaces.processKnowledge;

import br.ufpa.labes.spm.repository.interfaces.BaseDAO;
import br.ufpa.labes.spm.domain.ActivityEstimation;

public interface IActivityEstimationDAO extends BaseDAO<ActivityEstimation, Long> {
  public float getHoursEstimationForActivity(String normalIdent);
}
