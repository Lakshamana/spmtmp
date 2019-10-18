package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IExclusiveRepositoryQuery;
import br.ufpa.labes.spm.domain.Exclusive;

public class ExclusiveRepositoryQuery extends BaseRepositoryQueryImpl<Exclusive, Long> implements IExclusiveRepositoryQuery {

  protected ExclusiveRepositoryQuery(Class<Exclusive> businessClass) {
    super(businessClass);
  }

  public ExclusiveRepositoryQuery() {
    super(Exclusive.class);
  }
}
