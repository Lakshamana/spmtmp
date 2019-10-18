package br.ufpa.labes.spm.repository.interfaces.organizationPolicies;

import br.ufpa.labes.spm.repository.interfaces.BaseDAO;
import br.ufpa.labes.spm.domain.VCSRepository;
import br.ufpa.labes.spm.domain.Structure;

public interface IRepositoryDAO extends BaseDAO<VCSRepository, Long> {
  Structure getTheStructure(String ident);
}
