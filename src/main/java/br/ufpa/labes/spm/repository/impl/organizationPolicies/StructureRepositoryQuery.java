package br.ufpa.labes.spm.repository.impl.organizationPolicies;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.IStructureRepositoryQuery;
import br.ufpa.labes.spm.domain.Structure;

public class StructureRepositoryQuery extends BaseRepositoryQueryImpl<Structure, Long> implements IStructureRepositoryQuery {

  protected StructureRepositoryQuery(Class<Structure> businessClass) {
    super(businessClass);
  }

  public StructureRepositoryQuery() {
    super(Structure.class);
  }
}
