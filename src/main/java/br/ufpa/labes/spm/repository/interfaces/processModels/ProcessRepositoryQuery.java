package br.ufpa.labes.spm.repository.interfaces.processModels;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Process;
import br.ufpa.labes.spm.service.util.SimpleActivityQueryResult;

public interface ProcessRepositoryQuery {

  public SimpleActivityQueryResult[] getAllNormalActivitiesFromProcess(String processIdent);

  public SimpleActivityQueryResult[] getAllActivitiesFromProcess(String processIdent);
}
