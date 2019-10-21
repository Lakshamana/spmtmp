package br.ufpa.labes.spm.repository.impl.people;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.people.AuthorRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Author;

public class AuthorRepositoryQueryImpl implements AuthorRepositoryQuery {

  public AuthorRepositoryQueryImpl() {
    super(Author.class);
  }
}
