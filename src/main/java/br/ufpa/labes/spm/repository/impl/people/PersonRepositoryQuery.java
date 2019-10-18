package br.ufpa.labes.spm.repository.impl.people;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.people.IPersonRepositoryQuery;
import br.ufpa.labes.spm.domain.Person;

public class PersonRepositoryQuery extends BaseRepositoryQueryImpl<Person, Long> implements IPersonRepositoryQuery {

  public PersonRepositoryQuery() {
    super(Person.class);
  }
}
