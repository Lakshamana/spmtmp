package br.ufpa.labes.spm.repository.interfaces.organizationPolicies;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.VCSRepository;
import br.ufpa.labes.spm.domain.Structure;

public interface IRepositoryDAO extends BaseRepositoryQuery<VCSRepository, Long> {
  Structure getTheStructure(String ident);
}
