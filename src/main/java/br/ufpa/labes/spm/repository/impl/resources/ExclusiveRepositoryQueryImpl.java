package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.ExclusiveRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Exclusive;

public class ExclusiveRepositoryQueryImpl extends BaseRepositoryQueryImpl<Exclusive, Long> implements ExclusiveRepositoryQuery {

  protected ExclusiveRepositoryQueryImpl(Class<Exclusive> businessClass) {
    super(businessClass);
  }

  public ExclusiveRepositoryQueryImpl() {
    super(Exclusive.class);
  }
}
