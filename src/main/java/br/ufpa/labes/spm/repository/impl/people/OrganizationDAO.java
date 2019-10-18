package br.ufpa.labes.spm.repository.impl.people;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.people.IOrganizationDAO;
import br.ufpa.labes.spm.domain.Organization;

public class OrganizationDAO extends BaseDAOImpl<Organization, Long> implements IOrganizationDAO {

  public OrganizationDAO() {
    super(Organization.class);
  }
}
