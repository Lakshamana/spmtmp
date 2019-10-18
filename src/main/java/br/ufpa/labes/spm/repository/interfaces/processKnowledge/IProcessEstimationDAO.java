package br.ufpa.labes.spm.repository.interfaces.processKnowledge;

import br.ufpa.labes.spm.repository.interfaces.BaseDAO;
import br.ufpa.labes.spm.domain.ProcessEstimation;

public interface IProcessEstimationDAO extends BaseDAO<ProcessEstimation, Long> {

  public float getHoursEstimationForProject(String projectIdent);
}
