package br.ufpa.labes.spm.repository.interfaces.organizationPolicies;

import br.ufpa.labes.spm.repository.interfaces.BaseDAO;
import br.ufpa.labes.spm.domain.Company;

public interface ICompanyDAO extends BaseDAO<Company, Long> {

  boolean alreadyExistCNPJ(String cnpj, String ident);
}
