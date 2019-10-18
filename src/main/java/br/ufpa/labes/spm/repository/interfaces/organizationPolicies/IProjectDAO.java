package br.ufpa.labes.spm.repository.interfaces.organizationPolicies;

import java.util.List;

import br.ufpa.labes.spm.repository.interfaces.BaseDAO;
import br.ufpa.labes.spm.domain.Project;

public interface IProjectDAO extends BaseDAO<Project, Long> {
  public List<Project> findAll();
}
