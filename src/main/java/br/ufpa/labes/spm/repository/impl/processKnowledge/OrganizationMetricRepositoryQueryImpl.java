package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IOrganizationMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.OrganizationMetric;

public class OrganizationMetricRepositoryQueryImpl extends BaseRepositoryQueryImpl<OrganizationMetric, Long>
    implements IOrganizationMetricRepositoryQuery {

  protected OrganizationMetricRepositoryQueryImpl(Class<OrganizationMetric> businessClass) {
    super(businessClass);
  }

  public OrganizationMetricRepositoryQueryImpl() {
    super(OrganizationMetric.class);
  }
}
