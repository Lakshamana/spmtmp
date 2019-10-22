package br.ufpa.labes.spm.repository.interfaces.plainActivities;

import java.util.List;

import javax.persistence.EntityManager;

import br.ufpa.labes.spm.domain.ReqWorkGroup;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;

public interface ReqWorkGroupRepositoryQuery {

  public ReqWorkGroup update(ReqWorkGroup object);

  public ReqWorkGroup retrieve(String key);

  public List<ReqWorkGroup> retrieveByCriteria(ReqWorkGroup searchCriteria);

  public List<ReqWorkGroup> retrieveByCriteria(ReqWorkGroup searchCriteria, SortCriteria sortCriteria);

  public List<ReqWorkGroup> retrieveByCriteria(
      ReqWorkGroup searchCriteria, SortCriteria sortCriteria, PagingContext paging);

  public ReqWorkGroup retrieveBySecondaryKey(String ident);

  public String generateIdent(String oldIdent);

  public String generateIdent(String oldIdent, ReqWorkGroup t);

  public Class<ReqWorkGroup> getBusinessClass();

  public EntityManager getPersistenceContext();

  public ReqWorkGroup findReqWorkGroupFromProcessModel(
      String groupIdent, String WorkgroupTypeIdent, String normalIdent);
}
