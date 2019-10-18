package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IDependencyDAO;
import br.ufpa.labes.spm.domain.Dependency;

public class DependencyDAO extends BaseDAOImpl<Dependency, Long> implements IDependencyDAO {

  protected DependencyDAO(Class<Dependency> businessClass) {
    super(businessClass);
  }

  public DependencyDAO() {
    super(Dependency.class);
  }
}
