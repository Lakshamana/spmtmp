package br.ufpa.labes.spm.repository.impl.activities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.activities.IPlainRepositoryQuery;
import br.ufpa.labes.spm.domain.Plain;

public class PlainRepositoryQueryImpl extends BaseRepositoryQueryImpl<Plain, Long> implements IPlainRepositoryQuery {

  protected PlainRepositoryQueryImpl(Class<Plain> businessClass) {
    super(businessClass);
  }

  public PlainRepositoryQueryImpl() {
    super(Plain.class);
  }
}
