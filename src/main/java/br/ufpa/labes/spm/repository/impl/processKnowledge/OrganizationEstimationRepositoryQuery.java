package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IOrganizationEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.OrganizationEstimation;

public class OrganizationEstimationRepositoryQuery extends BaseRepositoryQueryImpl<OrganizationEstimation, Long>
    implements IOrganizationEstimationRepositoryQuery {

  protected OrganizationEstimationRepositoryQuery(Class<OrganizationEstimation> businessClass) {
    super(businessClass);
  }

  public OrganizationEstimationRepositoryQuery() {
    super(OrganizationEstimation.class);
  }
}
