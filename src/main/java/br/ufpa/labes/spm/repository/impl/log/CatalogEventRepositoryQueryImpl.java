package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.ICatalogEventRepositoryQuery;
import br.ufpa.labes.spm.domain.CatalogEvent;

public class CatalogEventRepositoryQueryImpl extends BaseRepositoryQueryImpl<CatalogEvent, Long> implements ICatalogEventRepositoryQuery {

  protected CatalogEventRepositoryQueryImpl(Class<CatalogEvent> businessClass) {
    super(businessClass);
  }

  public CatalogEventRepositoryQueryImpl() {
    super(CatalogEvent.class);
  }
}
