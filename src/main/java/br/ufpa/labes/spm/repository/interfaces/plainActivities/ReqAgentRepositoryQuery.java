package br.ufpa.labes.spm.repository.interfaces.plainActivities;

import java.util.List;

import javax.persistence.EntityManager;

import br.ufpa.labes.spm.domain.ReqAgent;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;

public interface ReqAgentRepositoryQuery {

  public ReqAgent update(ReqAgent object);

  public ReqAgent retrieve(String key);

  public List<ReqAgent> retrieveByCriteria(ReqAgent searchCriteria);

  public List<ReqAgent> retrieveByCriteria(ReqAgent searchCriteria, SortCriteria sortCriteria);

  public List<ReqAgent> retrieveByCriteria(
      ReqAgent searchCriteria, SortCriteria sortCriteria, PagingContext paging);

  public ReqAgent retrieveBySecondaryKey(String ident);

  public String generateIdent(String oldIdent);

  public String generateIdent(String oldIdent, ReqAgent t);

  public Class<ReqAgent> getBusinessClass();

  public EntityManager getPersistenceContext();

  public ReqAgent findReqAgentFromProcessModel(
      String agentIdent, String roleIdent, String normalIdent);
}
