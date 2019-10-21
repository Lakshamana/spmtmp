package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.CatalogEventRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.CatalogEvent;

public class CatalogEventRepositoryQueryImpl implements CatalogEventRepositoryQuery {

  protected CatalogEventRepositoryQueryImpl(Class<CatalogEvent> businessClass) {
    super(businessClass);
  }

  public CatalogEventRepositoryQueryImpl() {
    super(CatalogEvent.class);
  }
}
