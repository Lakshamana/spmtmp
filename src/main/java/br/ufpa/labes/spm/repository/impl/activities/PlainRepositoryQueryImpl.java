package br.ufpa.labes.spm.repository.impl.activities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.activities.PlainRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Plain;

public class PlainRepositoryQueryImpl extends BaseRepositoryQueryImpl<Plain, Long> implements PlainRepositoryQuery {

  protected PlainRepositoryQueryImpl(Class<Plain> businessClass) {
    super(businessClass);
  }

  public PlainRepositoryQueryImpl() {
    super(Plain.class);
  }
}
