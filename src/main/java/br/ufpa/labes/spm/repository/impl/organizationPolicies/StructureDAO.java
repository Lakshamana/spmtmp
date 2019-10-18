package br.ufpa.labes.spm.repository.impl.organizationPolicies;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.IStructureDAO;
import br.ufpa.labes.spm.domain.Structure;

public class StructureDAO extends BaseRepositoryQueryImpl<Structure, Long> implements IStructureDAO {

  protected StructureDAO(Class<Structure> businessClass) {
    super(businessClass);
  }

  public StructureDAO() {
    super(Structure.class);
  }
}
