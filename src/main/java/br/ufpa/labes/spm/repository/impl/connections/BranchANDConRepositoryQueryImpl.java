package br.ufpa.labes.spm.repository.impl.connections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.ufpa.labes.spm.annotations.Criteria;
import br.ufpa.labes.spm.annotations.EnumCriteriaType;
import br.ufpa.labes.spm.domain.BranchANDCon;
import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.BranchANDConRepositoryQuery;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;
import br.ufpa.labes.spm.util.ident.ConversorDeIdent;
import br.ufpa.labes.spm.util.ident.SemCaracteresEspeciais;
import br.ufpa.labes.spm.util.ident.TrocaEspacoPorPonto;

public class BranchANDConRepositoryQueryImpl extends BaseRepositoryQueryImpl<BranchANDCon, Long> implements BranchANDConRepositoryQuery{
  
  protected BranchANDConRepositoryQueryImpl(Class<BranchANDCon> businessClass) {
    super(businessClass);
  }

  public BranchANDConRepositoryQueryImpl() {
    super(BranchANDCon.class);
  }
}
