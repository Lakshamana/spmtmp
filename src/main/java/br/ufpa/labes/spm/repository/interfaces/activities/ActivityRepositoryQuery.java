package br.ufpa.labes.spm.repository.interfaces.activities;

import java.util.List;

import javax.persistence.EntityManager;

import br.ufpa.labes.spm.domain.Activity;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;

public interface ActivityRepositoryQuery {
  public Activity update(Activity object);

  public Activity retrieve(String key);

  public List<Activity> retrieveByCriteria(Activity searchCriteria);

  public List<Activity> retrieveByCriteria(Activity searchCriteria, SortCriteria sortCriteria);

  public List<Activity> retrieveByCriteria(
      Activity searchCriteria, SortCriteria sortCriteria, PagingContext paging);

  public Activity retrieveBySecondaryKey(String ident);

  public String generateIdent(String oldIdent);

  public String generateIdent(String oldIdent, Activity t);

  public Class<Activity> getBusinessClass();

  public EntityManager getPersistenceContext();
}
