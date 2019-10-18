package br.ufpa.labes.spm.repository.impl.people;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.people.IAuthorRepositoryQuery;
import br.ufpa.labes.spm.domain.Author;

public class AuthorRepositoryQuery extends BaseRepositoryQueryImpl<Author, Long> implements IAuthorRepositoryQuery {

  public AuthorRepositoryQuery() {
    super(Author.class);
  }
}
