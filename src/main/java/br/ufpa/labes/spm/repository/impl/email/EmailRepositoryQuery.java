package br.ufpa.labes.spm.repository.impl.email;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.email.IEmailRepositoryQuery;
import br.ufpa.labes.spm.domain.Email;

public class EmailRepositoryQuery extends BaseRepositoryQueryImpl<Email, Long> implements IEmailRepositoryQuery {

  protected EmailRepositoryQuery(Class<Email> businessClass) {
    super(businessClass);
  }

  public EmailRepositoryQuery() {
    super(Email.class);
  }
}
