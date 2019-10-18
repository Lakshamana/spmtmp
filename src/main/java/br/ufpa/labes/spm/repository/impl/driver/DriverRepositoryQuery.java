package br.ufpa.labes.spm.repository.impl.driver;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.driver.IDriverRepositoryQuery;
import br.ufpa.labes.spm.domain.Driver;

public class DriverRepositoryQuery extends BaseRepositoryQueryImpl<Driver, Long> implements IDriverRepositoryQuery {

  protected DriverRepositoryQuery(Class<Driver> businessClass) {
    super(businessClass);
  }

  public DriverRepositoryQuery() {
    super(Driver.class);
  }
}
