package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.ShareableRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Shareable;

public class ShareableRepositoryQueryImpl implements ShareableRepositoryQuery {

  protected ShareableRepositoryQueryImpl(Class<Shareable> businessClass) {
    super(businessClass);
  }

  public ShareableRepositoryQueryImpl() {
    super(Shareable.class);
  }
}
