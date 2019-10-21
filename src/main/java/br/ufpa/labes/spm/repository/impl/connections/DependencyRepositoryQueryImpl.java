package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.DependencyRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Dependency;

public class DependencyRepositoryQueryImpl extends BaseRepositoryQueryImpl<Dependency, Long> implements DependencyRepositoryQuery {

  protected DependencyRepositoryQueryImpl(Class<Dependency> businessClass) {
    super(businessClass);
  }

  public DependencyRepositoryQueryImpl() {
    super(Dependency.class);
  }
}
