package br.ufpa.labes.spm.repository.impl.organizationPolicies;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.IStructureRepositoryQuery;
import br.ufpa.labes.spm.domain.Structure;

public class StructureRepositoryQueryImpl extends BaseRepositoryQueryImpl<Structure, Long> implements IStructureRepositoryQuery {

  protected StructureRepositoryQueryImpl(Class<Structure> businessClass) {
    super(businessClass);
  }

  public StructureRepositoryQueryImpl() {
    super(Structure.class);
  }
}
