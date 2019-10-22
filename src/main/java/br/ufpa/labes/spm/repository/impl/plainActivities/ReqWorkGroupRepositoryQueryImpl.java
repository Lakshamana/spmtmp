package br.ufpa.labes.spm.repository.impl.plainActivities;

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
import br.ufpa.labes.spm.domain.ReqWorkGroup;
import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.ReqWorkGroupRepositoryQuery;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;
import br.ufpa.labes.spm.util.ident.ConversorDeIdent;
import br.ufpa.labes.spm.util.ident.SemCaracteresEspeciais;
import br.ufpa.labes.spm.util.ident.TrocaEspacoPorPonto;

public class ReqWorkGroupRepositoryQueryImpl implements ReqWorkGroupRepositoryQuery {

  @PersistenceContext
  private EntityManager em;

  private Class<ReqWorkGroup> businessClass;

  @Override
  public ReqWorkGroup update(ReqWorkGroup object) {
    this.getPersistenceContext().merge(object);
    return object;
  }

  @Override
  public List<ReqWorkGroup> retrieveByCriteria(ReqWorkGroup searchCriteria) {
    return retrieveByCriteria(searchCriteria, null, null);
  }

  @Override
  public List<ReqWorkGroup> retrieveByCriteria(ReqWorkGroup searchCriteria, SortCriteria sortCriteria) {
    return retrieveByCriteria(searchCriteria, sortCriteria, null);
  }

  @Override
  public List<ReqWorkGroup> retrieveByCriteria(
      ReqWorkGroup searchCriteria, SortCriteria sortCriteria, PagingContext paging) {
    ArrayList<Field> criteria = new ArrayList<Field>();
    Field[] fields = this.getBusinessClass().getDeclaredFields();

    for (Field field : fields) {
      if (field.getAnnotation(Criteria.class) != null) criteria.add(field);
    }

    String queryStr =
        "from " + this.getBusinessClass().getName() + " as obj " + "where true = true ";

    for (Field field : criteria) {
      try {
        String fieldName = field.getName();
        Object fieldValue = field.get(criteria);

        if (fieldValue != null) {
          queryStr +=
              "and obj."
                  + fieldName
                  + " "
                  + field.getAnnotation(Criteria.class).type().getFormattedText()
                  + " "
                  + ":"
                  + fieldName
                  + " ";
        }
      } catch (IllegalArgumentException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    }

    if (sortCriteria != null) {
      Collection<SortCriteria.SortEntry> entries = sortCriteria.getEntries().values();

      if (entries.size() > 0) {
        boolean isSorting = false;
        String orderByClause = "order by ";

        Iterator<SortCriteria.SortEntry> entryIterator = entries.iterator();

        while (entryIterator.hasNext()) {
          SortCriteria.SortEntry entry = entryIterator.next();
          String fieldName = entry.getFieldName();

          switch (entry.getType()) {
            case SortCriteria.SortEntry.TYPE_ASCENDING:
              orderByClause += "obj." + fieldName + " asc";
              isSorting = true;
              break;

            case SortCriteria.SortEntry.TYPE_DESCENDING:
              orderByClause += "obj." + fieldName + " desc";
              isSorting = true;
              break;
          }

          if (entryIterator.hasNext()) orderByClause += ", ";
        }

        if (isSorting) queryStr += orderByClause;
      }
    }

    Query query = getPersistenceContext().createQuery(queryStr);

    for (Field field : criteria) {
      try {
        String fieldName = field.getName();
        Object fieldValue = field.get(criteria);

        query.setParameter(
            fieldName,
            (field.getAnnotation(Criteria.class).type() == EnumCriteriaType.LIKE
                ? "%" + fieldValue + "%"
                : fieldValue));
      } catch (IllegalArgumentException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    }

    if (paging != null) {
      int firstResult = (paging.getPageNumber() - 1) * paging.getResultsPerPage();

      query.setFirstResult(firstResult);
      query.setMaxResults(paging.getResultsPerPage());
    }

    return query.getResultList();
  }

  @Override
  public ReqWorkGroup retrieve(String key) {
    return this.getPersistenceContext().find(this.getBusinessClass(), key);
  }

  @Override
  public Class<ReqWorkGroup> getBusinessClass() {
    return this.businessClass;
  }

  @Override
  public EntityManager getPersistenceContext() {
    return em;
  }

  @Override
  public ReqWorkGroup retrieveBySecondaryKey(String ident) {
    Query query =
        this.getPersistenceContext()
            .createQuery("FROM " + businessClass.getName() + " as obj WHERE obj.ident = :ident");
    query.setParameter("ident", ident);
    List retorno = (List) query.getResultList();
    if (retorno != null) {
      if (!retorno.isEmpty()) {
        // System.out.println("caiu na consulta"+retorno.get(0));
        return (ReqWorkGroup) retorno.get(0);
      } else {
        return null;
      }
    } else return null;
  }

  @Override
  public String generateIdent(String oldIdent) {
    return ConversorDeIdent.de(oldIdent)
        .para(new SemCaracteresEspeciais())
        .para(new TrocaEspacoPorPonto())
        .ident();
  }

  @Override
  public String generateIdent(String oldIdent, ReqWorkGroup t) {
    oldIdent = this.concatOidOnString(oldIdent, t);
    return ConversorDeIdent.de(oldIdent)
        .para(new SemCaracteresEspeciais())
        .para(new TrocaEspacoPorPonto())
        .ident();
  }

  private String concatOidOnString(String oldIdent, ReqWorkGroup t) {
    Method method = null;
    String oid = "";
    try {
      method = t.getClass().getMethod("getId", new Class<?>[0]);
      oid = method.invoke(t, new Object[0]).toString();
      oid = oid.concat(" " + oldIdent);
    } catch (NoSuchMethodException e) {
      System.out.println(
          "O método oid não foi encontrado para a entidade " + t.getClass().getSimpleName());
      e.printStackTrace();
    } catch (SecurityException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    return oid;
  }

public class ReqWorkGroupRepositoryQueryImpl extends BaseRepositoryQueryImpl<ReqWorkGroup, Long> implements ReqWorkGroupRepositoryQuery{

  protected ReqWorkGroupRepositoryQueryImpl(Class<ReqWorkGroup> businessClass) {
    super(businessClass);
  }

  public ReqWorkGroupRepositoryQueryImpl() {
    super(ReqWorkGroup.class);
  }

  public ReqWorkGroup findReqWorkGroupFromProcessModel(
      String groupIdent, String WorkgroupTypeIdent, String normalIdent) {
    List<ReqWorkGroup> retorno = null;

    if (groupIdent != null && !groupIdent.equals("")) {

      String hql =
          "SELECT ReqWorkGroup FROM "
              + ReqWorkGroup.class.getName()
              + " AS ReqWorkGroup WHERE ReqWorkGroup.theGroup.ident=:groupIdent AND ReqWorkGroup.theGroupType.ident=:WorkgroupTypeIdent AND ReqWorkGroup.theNormal.ident=:normalIdent";
      Query query = getPersistenceContext().createQuery(hql);
      query.setParameter("groupIdent", groupIdent);
      query.setParameter("groupTypeIdent", WorkgroupTypeIdent);
      query.setParameter("normalIdent", normalIdent);

      retorno = (List<ReqWorkGroup>) query.getResultList();
    } else {

      String hql =
          "SELECT ReqWorkGroup FROM "
              + ReqWorkGroup.class.getName()
              + " AS ReqWorkGroup WHERE ReqWorkGroup.theGroupType.ident=:WorkgroupTypeIdent AND ReqWorkGroup.theNormal.ident=:normalIdent";
      Query query = getPersistenceContext().createQuery(hql);
      query.setParameter("groupTypeIdent", WorkgroupTypeIdent);
      query.setParameter("normalIdent", normalIdent);

      retorno = (List<ReqWorkGroup>) query.getResultList();
    }

    if (retorno != null) {
      if (!retorno.isEmpty()) {
        return retorno.get(0);
      } else {
        return null;
      }
    } else return null;
  }
}
