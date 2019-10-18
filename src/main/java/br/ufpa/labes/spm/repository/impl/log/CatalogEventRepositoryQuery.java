package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.ICatalogEventRepositoryQuery;
import br.ufpa.labes.spm.domain.CatalogEvent;

public class CatalogEventRepositoryQuery extends BaseRepositoryQueryImpl<CatalogEvent, Long> implements ICatalogEventRepositoryQuery {

  protected CatalogEventRepositoryQuery(Class<CatalogEvent> businessClass) {
    super(businessClass);
  }

  public CatalogEventRepositoryQuery() {
    super(CatalogEvent.class);
  }
}
