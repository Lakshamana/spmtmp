package br.ufpa.labes.spm.repository.impl.organizationPolicies;

import java.util.List;

import javax.persistence.Query;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.ProjectRepositoryQuery;
import br.ufpa.labes.spm.domain.Project;

public class ProjectRepositoryQueryImpl extends BaseRepositoryQueryImpl<Project, Long> implements ProjectRepositoryQuery{

  @Override
  public List<Project> findAll() {
    String hql = "select project from " + Project.class.getSimpleName() + " as artifact";
    Query query = this.getPersistenceContext().createQuery(hql);
    return query.getResultList();
  }
}
