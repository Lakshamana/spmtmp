package br.ufpa.labes.spm.repository.impl.people;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.people.IPersonDAO;
import br.ufpa.labes.spm.domain.Person;

public class PersonDAO extends BaseRepositoryQueryImpl<Person, Long> implements IPersonDAO {

  public PersonDAO() {
    super(Person.class);
  }
}
