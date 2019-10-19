package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IOrganizationEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.OrganizationEstimation;

public class OrganizationEstimationRepositoryQueryImpl extends BaseRepositoryQueryImpl<OrganizationEstimation, Long>
    implements IOrganizationEstimationRepositoryQuery {

  protected OrganizationEstimationRepositoryQueryImpl(Class<OrganizationEstimation> businessClass) {
    super(businessClass);
  }

  public OrganizationEstimationRepositoryQueryImpl() {
    super(OrganizationEstimation.class);
  }
}
