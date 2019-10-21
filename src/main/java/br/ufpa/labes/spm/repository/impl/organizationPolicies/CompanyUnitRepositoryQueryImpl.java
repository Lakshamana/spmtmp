package br.ufpa.labes.spm.repository.impl.organizationPolicies;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.CompanyUnitRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.CompanyUnit;

public class CompanyUnitRepositoryQueryImpl extends BaseRepositoryQueryImpl<CompanyUnit, Long> implements CompanyUnitRepositoryQuery {

  protected CompanyUnitRepositoryQueryImpl(Class<CompanyUnit> businessClass) {
    super(businessClass);
  }

  public CompanyUnitRepositoryQueryImpl() {
    super(CompanyUnit.class);
  }
}
