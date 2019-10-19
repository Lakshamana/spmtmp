package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IExclusiveRepositoryQuery;
import br.ufpa.labes.spm.domain.Exclusive;

public class ExclusiveRepositoryQueryImpl extends BaseRepositoryQueryImpl<Exclusive, Long> implements IExclusiveRepositoryQuery {

  protected ExclusiveRepositoryQueryImpl(Class<Exclusive> businessClass) {
    super(businessClass);
  }

  public ExclusiveRepositoryQueryImpl() {
    super(Exclusive.class);
  }
}
