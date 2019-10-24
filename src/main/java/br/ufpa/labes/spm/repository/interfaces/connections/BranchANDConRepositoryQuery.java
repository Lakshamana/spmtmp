package br.ufpa.labes.spm.repository.interfaces.connections;

import java.util.List;

import javax.persistence.EntityManager;

import br.ufpa.labes.spm.domain.BranchANDCon;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;

public interface BranchANDConRepositoryQuery {
  public BranchANDCon update(BranchANDCon object);

  public BranchANDCon retrieve(String key);

  public List<BranchANDCon> retrieveByCriteria(BranchANDCon searchCriteria);

  public List<BranchANDCon> retrieveByCriteria(BranchANDCon searchCriteria, SortCriteria sortCriteria);

  public List<BranchANDCon> retrieveByCriteria(
      BranchANDCon searchCriteria, SortCriteria sortCriteria, PagingContext paging);

  public BranchANDCon retrieveBySecondaryKey(String ident);

  public String generateIdent(String oldIdent);

  public String generateIdent(String oldIdent, BranchANDCon t);

  public Class<BranchANDCon> getBusinessClass();

  public EntityManager getPersistenceContext();
}
