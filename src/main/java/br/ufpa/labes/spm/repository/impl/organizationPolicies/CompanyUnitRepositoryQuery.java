package br.ufpa.labes.spm.repository.impl.organizationPolicies;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.ICompanyUnitRepositoryQuery;
import br.ufpa.labes.spm.domain.CompanyUnit;

public class CompanyUnitRepositoryQuery extends BaseRepositoryQueryImpl<CompanyUnit, Long> implements ICompanyUnitRepositoryQuery {

  protected CompanyUnitRepositoryQuery(Class<CompanyUnit> businessClass) {
    super(businessClass);
  }

  public CompanyUnitRepositoryQuery() {
    super(CompanyUnit.class);
  }
}
