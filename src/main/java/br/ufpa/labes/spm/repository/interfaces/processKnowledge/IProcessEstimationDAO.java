package br.ufpa.labes.spm.repository.interfaces.processKnowledge;

import br.ufpa.labes.spm.repository.interfaces.IBaseDAO;
import br.ufpa.labes.spm.domain.ProcessEstimation;

public interface IProcessEstimationDAO extends IBaseDAO<ProcessEstimation, Long> {

  public float getHoursEstimationForProject(String projectIdent);
}
