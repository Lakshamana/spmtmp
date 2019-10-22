package br.ufpa.labes.spm.repository.impl.artifacts;

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
import br.ufpa.labes.spm.domain.Artifact;
import br.ufpa.labes.spm.domain.ArtifactCon;
import br.ufpa.labes.spm.domain.InvolvedArtifact;
import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.artifacts.ArtifactRepositoryQuery;
import br.ufpa.labes.spm.service.dto.SimpleArtifactDescriptorDTO;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;
import br.ufpa.labes.spm.util.ident.ConversorDeIdent;
import br.ufpa.labes.spm.util.ident.SemCaracteresEspeciais;
import br.ufpa.labes.spm.util.ident.TrocaEspacoPorPonto;

public class ArtifactRepositoryQueryImpl extends BaseRepositoryQueryImpl<Artifact, Long> implements ArtifactRepositoryQuery{

  @PersistenceContext
  private EntityManager em;

  private Class<Artifact> businessClass;

  @Override
  public Artifact update(Artifact object) {
    this.getPersistenceContext().merge(object);
    return object;
  }

  @Override
  public List<Artifact> retrieveByCriteria(Artifact searchCriteria) {
    return retrieveByCriteria(searchCriteria, null, null);
  }

  @Override
  public List<Artifact> retrieveByCriteria(Artifact searchCriteria, SortCriteria sortCriteria) {
    return retrieveByCriteria(searchCriteria, sortCriteria, null);
  }

  @Override
  public List<Artifact> retrieveByCriteria(
      Artifact searchCriteria, SortCriteria sortCriteria, PagingContext paging) {
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
  public Artifact retrieve(String key) {
    return this.getPersistenceContext().find(this.getBusinessClass(), key);
  }

  @Override
  public Class<Artifact> getBusinessClass() {
    return this.businessClass;
  }

  @Override
  public EntityManager getPersistenceContext() {
    return em;
  }

  @Override
  public Artifact retrieveBySecondaryKey(String ident) {
    Query query =
        this.getPersistenceContext()
            .createQuery("FROM " + businessClass.getName() + " as obj WHERE obj.ident = :ident");
    query.setParameter("ident", ident);
    List retorno = (List) query.getResultList();
    if (retorno != null) {
      if (!retorno.isEmpty()) {
        // System.out.println("caiu na consulta"+retorno.get(0));
        return (Artifact) retorno.get(0);
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
  public String generateIdent(String oldIdent, Artifact t) {
    oldIdent = this.concatOidOnString(oldIdent, t);
    return ConversorDeIdent.de(oldIdent)
        .para(new SemCaracteresEspeciais())
        .para(new TrocaEspacoPorPonto())
        .ident();
  }

  private String concatOidOnString(String oldIdent, Artifact t) {
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

  @Override
  public Object[] getArtifactsIdentsFromProcessModelWithoutTemplates(String ident) {
    String hql =
        " select DISTINCT theArtifact.ident from "
            + ArtifactCon.class.getName()
            + " as artfCon where (artfCon.ident like '"
            + ident
            + ".%')"
            + " and (artfCon.theArtifact.isTemplate = 'false')";

    Query query = this.getPersistenceContext().createQuery(hql);

    List result = query.getResultList();
    int size = result.size();
    System.out.println("templates lista: " + result);
    return result.toArray();
  }

  @Override
  public Artifact getByName(String name) {
    String hql =
        " select DISTINCT artifact from "
            + Artifact.class.getName()
            + " as artifact where artifact.name =:name";

    Query query = this.getPersistenceContext().createQuery(hql);
    query.setParameter("name", name);
    return (Artifact) query.getSingleResult();
  }

  @Override
  public SimpleArtifactDescriptorDTO[] getInputArtifactsForNormal(String normalIdent) {

    String hql =
        " from "
            + InvolvedArtifact.class.getName()
            + " as involvedArtifact where (involvedArtifact.inInvolvedArtifacts.ident=:normalID) ";
    Query query = this.getPersistenceContext().createQuery(hql);

    query.setParameter("normalID", normalIdent);

    List<InvolvedArtifact> result = query.getResultList();

    ArrayList<Artifact> inputArtifacts = new ArrayList<Artifact>();

    for (InvolvedArtifact involvedArtifact : result) {
      if (involvedArtifact.getTheArtifact() != null)
        inputArtifacts.add(involvedArtifact.getTheArtifact());
    }

    Artifact[] inputArtifactsArray = new Artifact[inputArtifacts.size()];
    inputArtifactsArray = inputArtifacts.toArray(inputArtifactsArray);

    SimpleArtifactDescriptorDTO[] artifactDescriptors =
        new SimpleArtifactDescriptorDTO[inputArtifactsArray.length];

    for (int i = 0; i < inputArtifactsArray.length; i++) {
      if (inputArtifactsArray[i] != null) {
        String artifactIdent = inputArtifactsArray[i].getIdent();
        String artifactName = inputArtifactsArray[i].getName();
        String latestVersion = inputArtifactsArray[i].getLatestVersion();
        String fileName = inputArtifactsArray[i].getFileName();
        String repositoryIdent = null;
        if (inputArtifactsArray[i].getTheRepository() != null)
          repositoryIdent = inputArtifactsArray[i].getTheRepository().getIdent();

        artifactDescriptors[i] =
            new SimpleArtifactDescriptorDTO(
                artifactIdent, artifactName, latestVersion, fileName, repositoryIdent);
      }
    }
    System.out.println("no RepositoryQuery: " + artifactDescriptors.length);
    return artifactDescriptors;
  }

  @Override
  public SimpleArtifactDescriptorDTO[] getOutputArtifactsForNormal(String normalIdent) {
    String hql =
        " from "
            + InvolvedArtifact.class.getName()
            + " as involvedArtifact where (involvedArtifact.outInvolvedArtifacts.ident=:normalID) ";

    Query query = this.getPersistenceContext().createQuery(hql);

    query.setParameter("normalID", normalIdent);

    List<InvolvedArtifact> result = query.getResultList();
    Iterator<InvolvedArtifact> resultIterator = result.iterator();

    ArrayList<Artifact> outputArtifacts = new ArrayList<Artifact>();

    for (InvolvedArtifact involvedArtifact : result) {
      if (involvedArtifact.getTheArtifact() != null)
        outputArtifacts.add(involvedArtifact.getTheArtifact());
    }

    Artifact[] outputArtifactsArray = new Artifact[outputArtifacts.size()];
    outputArtifactsArray = outputArtifacts.toArray(outputArtifactsArray);

    SimpleArtifactDescriptorDTO[] artifactDescriptors =
        new SimpleArtifactDescriptorDTO[outputArtifactsArray.length];

    for (int i = 0; i < outputArtifactsArray.length; i++) {
      if (outputArtifactsArray[i] != null) {
        String artifactIdent = outputArtifactsArray[i].getIdent();
        String artifactName = outputArtifactsArray[i].getName();
        String latestVersion = outputArtifactsArray[i].getLatestVersion();
        String fileName = outputArtifactsArray[i].getFileName();

        String repositoryIdent = null;
        if (outputArtifactsArray[i].getTheRepository() != null)
          repositoryIdent = outputArtifactsArray[i].getTheRepository().getIdent();

        artifactDescriptors[i] =
            new SimpleArtifactDescriptorDTO(
                artifactIdent, artifactName, latestVersion, fileName, repositoryIdent);
      }
    }
    return artifactDescriptors;
  }
}
