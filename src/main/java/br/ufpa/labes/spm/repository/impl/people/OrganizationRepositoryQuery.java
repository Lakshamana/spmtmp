package br.ufpa.labes.spm.repository.impl.people;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.people.IOrganizationRepositoryQuery;
import br.ufpa.labes.spm.domain.Organization;

public class OrganizationRepositoryQuery extends BaseRepositoryQueryImpl<Organization, Long> implements IOrganizationRepositoryQuery {

  public OrganizationRepositoryQuery() {
    super(Organization.class);
  }
}
