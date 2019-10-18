package br.ufpa.labes.spm.repository.interfaces.processKnowledge;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ProcessEstimation;

public interface IProcessEstimationRepositoryQuery extends BaseRepositoryQuery<ProcessEstimation, Long> {

  public float getHoursEstimationForProject(String projectIdent);
}