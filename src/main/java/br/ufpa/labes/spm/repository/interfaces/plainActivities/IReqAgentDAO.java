package br.ufpa.labes.spm.repository.interfaces.plainActivities;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ReqAgent;

public interface IReqAgentDAO extends BaseRepositoryQuery<ReqAgent, Long> {

  public ReqAgent findReqAgentFromProcessModel(
      String agentIdent, String roleIdent, String normalIdent);
}
