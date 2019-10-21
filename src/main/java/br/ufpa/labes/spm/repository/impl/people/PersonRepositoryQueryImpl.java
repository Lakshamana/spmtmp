package br.ufpa.labes.spm.repository.impl.people;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.people.PersonRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Person;

public class PersonRepositoryQueryImpl implements PersonRepositoryQuery {

  public PersonRepositoryQueryImpl() {
    super(Person.class);
  }
}
