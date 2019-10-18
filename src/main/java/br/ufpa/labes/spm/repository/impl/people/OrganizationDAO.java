package br.ufpa.labes.spm.repository.impl.people;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.people.IOrganizationDAO;
import br.ufpa.labes.spm.domain.Organization;

public class OrganizationDAO extends BaseRepositoryQueryImpl<Organization, Long> implements IOrganizationDAO {

  public OrganizationDAO() {
    super(Organization.class);
  }
}
