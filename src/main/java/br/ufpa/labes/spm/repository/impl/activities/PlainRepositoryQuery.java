package br.ufpa.labes.spm.repository.impl.activities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.activities.IPlainRepositoryQuery;
import br.ufpa.labes.spm.domain.Plain;

public class PlainRepositoryQuery extends BaseRepositoryQueryImpl<Plain, Long> implements IPlainRepositoryQuery {

  protected PlainRepositoryQuery(Class<Plain> businessClass) {
    super(businessClass);
  }

  public PlainRepositoryQuery() {
    super(Plain.class);
  }
}
