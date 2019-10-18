package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.ICatalogEventDAO;
import br.ufpa.labes.spm.domain.CatalogEvent;

public class CatalogEventDAO extends BaseRepositoryQueryImpl<CatalogEvent, Long> implements ICatalogEventDAO {

  protected CatalogEventDAO(Class<CatalogEvent> businessClass) {
    super(businessClass);
  }

  public CatalogEventDAO() {
    super(CatalogEvent.class);
  }
}
