package br.ufpa.labes.spm.repository.interfaces.agent;

import java.util.List;

import javax.persistence.EntityManager;

import br.ufpa.labes.spm.domain.Agent;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.service.dto.AgentDTO;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;

public interface AgentRepositoryQuery extends BaseRepositoryQuery<Agent, Long> {

  public AgentDTO login(String login, String senha);

  public Agent update(Agent object);

  public Agent retrieve(String key);

  public List<Agent> retrieveByCriteria(Agent searchCriteria);

  public List<Agent> retrieveByCriteria(Agent searchCriteria, SortCriteria sortCriteria);

  public List<Agent> retrieveByCriteria(
      Agent searchCriteria, SortCriteria sortCriteria, PagingContext paging);

  public Agent retrieveBySecondaryKey(String ident);

  public String generateIdent(String oldIdent);

  public String generateIdent(String oldIdent, Agent t);

  // public Class<Agent> getBusinessClass();

  public EntityManager getPersistenceContext();
}
