package br.ufpa.labes.spm.repository.interfaces.organizationPolicies;

import java.util.List;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Project;

public interface ProjectRepositoryQuery {
  public List<Project> findAll();
}
