package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.OrganizationEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.OrganizationEstimation;

public class OrganizationEstimationRepositoryQueryImpl extends BaseRepositoryQueryImpl<OrganizationEstimation, Long>
    implements OrganizationEstimationRepositoryQuery{

  protected OrganizationEstimationRepositoryQueryImpl(Class<OrganizationEstimation> businessClass) {
    super(businessClass);
  }

  public OrganizationEstimationRepositoryQueryImpl() {
    super(OrganizationEstimation.class);
  }
}
