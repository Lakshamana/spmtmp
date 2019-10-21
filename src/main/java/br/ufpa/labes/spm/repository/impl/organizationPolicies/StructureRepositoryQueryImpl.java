package br.ufpa.labes.spm.repository.impl.organizationPolicies;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.StructureRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Structure;

public class StructureRepositoryQueryImpl extends BaseRepositoryQueryImpl<Structure, Long> implements StructureRepositoryQuery {

  protected StructureRepositoryQueryImpl(Class<Structure> businessClass) {
    super(businessClass);
  }

  public StructureRepositoryQueryImpl() {
    super(Structure.class);
  }
}
