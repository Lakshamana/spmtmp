package br.ufpa.labes.spm.repository.interfaces.connections;

import java.util.List;

import javax.persistence.EntityManager;

import br.ufpa.labes.spm.domain.BranchCon;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;

public interface BranchConRepositoryQuery extends BaseRepositoryQuery<BranchCon, Long> {
  public BranchCon update(BranchCon object);

  public BranchCon retrieve(String key);

  public List<BranchCon> retrieveByCriteria(BranchCon searchCriteria);

  public List<BranchCon> retrieveByCriteria(BranchCon searchCriteria, SortCriteria sortCriteria);

  public List<BranchCon> retrieveByCriteria(
      BranchCon searchCriteria, SortCriteria sortCriteria, PagingContext paging);

  public BranchCon retrieveBySecondaryKey(String ident);

  public String generateIdent(String oldIdent);

  public String generateIdent(String oldIdent, BranchCon t);

  public Class<BranchCon> getBusinessClass();

  public EntityManager getPersistenceContext();
}
