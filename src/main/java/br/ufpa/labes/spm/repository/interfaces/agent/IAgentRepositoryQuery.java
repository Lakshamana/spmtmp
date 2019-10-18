package br.ufpa.labes.spm.repository.interfaces.agent;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.service.dto.AgentDTO;
import br.ufpa.labes.spm.domain.Agent;

public interface IAgentRepositoryQuery extends BaseRepositoryQuery<Agent, Long> {

  public AgentDTO login(String login, String senha);
}
