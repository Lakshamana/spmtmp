package br.ufpa.labes.spm.repository.impl;

import br.ufpa.labes.spm.repository.interfaces.IUserRepositoryQuery;
import br.ufpa.labes.spm.domain.User;

public class UserRepositoryQuery extends BaseRepositoryQueryImpl<User, Long> implements IUserRepositoryQuery {

  public UserRepositoryQuery() {
    super(User.class);
  }
}
