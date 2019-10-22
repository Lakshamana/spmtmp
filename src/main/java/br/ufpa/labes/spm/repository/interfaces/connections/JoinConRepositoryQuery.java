package br.ufpa.labes.spm.repository.interfaces.connections;

import java.util.List;

import javax.persistence.EntityManager;

import br.ufpa.labes.spm.domain.JoinCon;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;

public interface JoinConRepositoryQuery extends BaseRepositoryQuery<JoinCon, Long> {
  public JoinCon update(JoinCon object);

  public JoinCon retrieve(String key);

  public List<JoinCon> retrieveByCriteria(JoinCon searchCriteria);

  public List<JoinCon> retrieveByCriteria(JoinCon searchCriteria, SortCriteria sortCriteria);

  public List<JoinCon> retrieveByCriteria(
      JoinCon searchCriteria, SortCriteria sortCriteria, PagingContext paging);

  public JoinCon retrieveBySecondaryKey(String ident);

  public String generateIdent(String oldIdent);

  public String generateIdent(String oldIdent, JoinCon t);

  public Class<JoinCon> getBusinessClass();

  public EntityManager getPersistenceContext();
}
