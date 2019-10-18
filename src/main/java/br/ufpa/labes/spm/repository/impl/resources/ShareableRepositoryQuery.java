package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IShareableRepositoryQuery;
import br.ufpa.labes.spm.domain.Shareable;

public class ShareableRepositoryQuery extends BaseRepositoryQueryImpl<Shareable, Long> implements IShareableRepositoryQuery {

  protected ShareableRepositoryQuery(Class<Shareable> businessClass) {
    super(businessClass);
  }

  public ShareableRepositoryQuery() {
    super(Shareable.class);
  }
}
