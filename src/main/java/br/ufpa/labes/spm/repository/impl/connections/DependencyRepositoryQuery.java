package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IDependencyRepositoryQuery;
import br.ufpa.labes.spm.domain.Dependency;

public class DependencyRepositoryQuery extends BaseRepositoryQueryImpl<Dependency, Long> implements IDependencyRepositoryQuery {

  protected DependencyRepositoryQuery(Class<Dependency> businessClass) {
    super(businessClass);
  }

  public DependencyRepositoryQuery() {
    super(Dependency.class);
  }
}
