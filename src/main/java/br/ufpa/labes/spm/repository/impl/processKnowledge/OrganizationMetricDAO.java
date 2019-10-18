package br.ufpa.labes.spm.repository.impl.processKnowledge;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IOrganizationMetricDAO;
import br.ufpa.labes.spm.domain.OrganizationMetric;

public class OrganizationMetricDAO extends BaseRepositoryQueryImpl<OrganizationMetric, Long>
    implements IOrganizationMetricDAO {

  protected OrganizationMetricDAO(Class<OrganizationMetric> businessClass) {
    super(businessClass);
  }

  public OrganizationMetricDAO() {
    super(OrganizationMetric.class);
  }
}
