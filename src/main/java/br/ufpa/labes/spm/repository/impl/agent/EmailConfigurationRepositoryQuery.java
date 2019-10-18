package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.IEmailConfigurationRepositoryQuery;
import br.ufpa.labes.spm.domain.EmailConfiguration;

public class EmailConfigurationRepositoryQuery extends BaseRepositoryQueryImpl<EmailConfiguration, Long>
    implements IEmailConfigurationRepositoryQuery {

  protected EmailConfigurationRepositoryQuery(Class<EmailConfiguration> businessClass) {
    super(businessClass);
  }

  public EmailConfigurationRepositoryQuery() {
    super(EmailConfiguration.class);
  }
}
