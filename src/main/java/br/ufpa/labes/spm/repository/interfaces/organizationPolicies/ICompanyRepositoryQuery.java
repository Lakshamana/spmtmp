package br.ufpa.labes.spm.repository.interfaces.organizationPolicies;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Company;

public interface ICompanyRepositoryQuery extends BaseRepositoryQuery<Company, Long> {

  boolean alreadyExistCNPJ(String cnpj, String ident);
}
