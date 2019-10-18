package br.ufpa.labes.spm.repository.interfaces.plainActivities;

import br.ufpa.labes.spm.repository.interfaces.BaseDAO;
import br.ufpa.labes.spm.domain.ReqAgent;

public interface IReqAgentDAO extends BaseDAO<ReqAgent, Long> {

  public ReqAgent findReqAgentFromProcessModel(
      String agentIdent, String roleIdent, String normalIdent);
}
