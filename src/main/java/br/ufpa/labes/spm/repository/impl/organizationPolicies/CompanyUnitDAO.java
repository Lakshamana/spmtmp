package br.ufpa.labes.spm.repository.impl.organizationPolicies;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.ICompanyUnitDAO;
import br.ufpa.labes.spm.domain.CompanyUnit;

public class CompanyUnitDAO extends BaseDAOImpl<CompanyUnit, Long> implements ICompanyUnitDAO {

  protected CompanyUnitDAO(Class<CompanyUnit> businessClass) {
    super(businessClass);
  }

  public CompanyUnitDAO() {
    super(CompanyUnit.class);
  }
}
