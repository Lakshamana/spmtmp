package br.ufpa.labes.spm.repository.impl.driver;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.driver.DriverRepositoryQuery;
import br.ufpa.labes.spm.domain.Driver;

public class DriverRepositoryQueryImpl extends BaseRepositoryQueryImpl<Driver, Long> implements DriverRepositoryQuery{

  protected DriverRepositoryQueryImpl(Class<Driver> businessClass) {
    super(businessClass);
  }

  public DriverRepositoryQueryImpl() {
    super(Driver.class);
  }
}
