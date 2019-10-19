package br.ufpa.labes.spm.repository.impl;

import br.ufpa.labes.spm.repository.interfaces.IUserRepositoryQuery;
import br.ufpa.labes.spm.domain.User;

public class UserRepositoryQueryImpl extends BaseRepositoryQueryImpl<User, Long> implements IUserRepositoryQuery {

  public UserRepositoryQueryImpl() {
    super(User.class);
  }
}
