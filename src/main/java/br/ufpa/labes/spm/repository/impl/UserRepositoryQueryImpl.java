package br.ufpa.labes.spm.repository.impl;

import br.ufpa.labes.spm.repository.interfaces.UserRepositoryQuery;
import br.ufpa.labes.spm.domain.User;

public class UserRepositoryQueryImpl extends BaseRepositoryQueryImpl<User, Long> implements UserRepositoryQuery{

  public UserRepositoryQueryImpl() {
    super(User.class);
  }
}
