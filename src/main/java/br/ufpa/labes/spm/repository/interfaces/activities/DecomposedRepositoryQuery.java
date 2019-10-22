package br.ufpa.labes.spm.repository.interfaces.activities;

import java.util.List;

import javax.persistence.EntityManager;

import br.ufpa.labes.spm.domain.Decomposed;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;

public interface DecomposedRepositoryQuery {
  public Decomposed update(Decomposed object);

  public Decomposed retrieve(String key);

  public List<Decomposed> retrieveByCriteria(Decomposed searchCriteria);

  public List<Decomposed> retrieveByCriteria(Decomposed searchCriteria, SortCriteria sortCriteria);

  public List<Decomposed> retrieveByCriteria(
      Decomposed searchCriteria, SortCriteria sortCriteria, PagingContext paging);

  public Decomposed retrieveBySecondaryKey(String ident);

  public String generateIdent(String oldIdent);

  public String generateIdent(String oldIdent, Decomposed t);

  public Class<Decomposed> getBusinessClass();

  public EntityManager getPersistenceContext();
}
