package br.ufpa.labes.spm.repository.impl.organizationPolicies;

import java.util.List;

import javax.persistence.Query;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.IProjectRepositoryQuery;
import br.ufpa.labes.spm.domain.Project;

public class ProjectRepositoryQuery extends BaseRepositoryQueryImpl<Project, Long> implements IProjectRepositoryQuery {

  protected ProjectRepositoryQuery(Class<Project> businessClass) {
    super(businessClass);
  }

  public ProjectRepositoryQuery() {
    super(Project.class);
  }

  @Override
  public List<Project> findAll() {
    String hql = "select project from " + Project.class.getSimpleName() + " as artifact";
    Query query = this.getPersistenceContext().createQuery(hql);
    return query.getResultList();
  }
}
