package br.ufpa.labes.spm.repository.interfaces.organizationPolicies;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Company;

public interface CompanyRepositoryQuery {

  boolean alreadyExistCNPJ(String cnpj, String ident);
}
