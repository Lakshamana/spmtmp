package br.ufpa.labes.spm.repository.impl.people;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.people.IAuthorDAO;
import br.ufpa.labes.spm.domain.Author;

public class AuthorDAO extends BaseRepositoryQueryImpl<Author, Long> implements IAuthorDAO {

  public AuthorDAO() {
    super(Author.class);
  }
}
