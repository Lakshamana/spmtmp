package br.ufpa.labes.spm.repository.interfaces.activities;

import java.util.List;

import javax.persistence.EntityManager;

import br.ufpa.labes.spm.domain.Plain;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;

public interface PlainRepositoryQuery {
  public Plain update(Plain object);

  public Plain retrieve(String key);

  public List<Plain> retrieveByCriteria(Plain searchCriteria);

  public List<Plain> retrieveByCriteria(Plain searchCriteria, SortCriteria sortCriteria);

  public List<Plain> retrieveByCriteria(
      Plain searchCriteria, SortCriteria sortCriteria, PagingContext paging);

  public Plain retrieveBySecondaryKey(String ident);

  public String generateIdent(String oldIdent);

  public String generateIdent(String oldIdent, Plain t);

  public Class<Plain> getBusinessClass();

  public EntityManager getPersistenceContext();
}
