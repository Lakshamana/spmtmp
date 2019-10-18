package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IOrganizationMetricRepositoryQuery;
import br.ufpa.labes.spm.domain.OrganizationMetric;

public class OrganizationMetricRepositoryQuery extends BaseRepositoryQueryImpl<OrganizationMetric, Long>
    implements IOrganizationMetricRepositoryQuery {

  protected OrganizationMetricRepositoryQuery(Class<OrganizationMetric> businessClass) {
    super(businessClass);
  }

  public OrganizationMetricRepositoryQuery() {
    super(OrganizationMetric.class);
  }
}
