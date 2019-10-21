package br.ufpa.labes.spm.repository.impl.agent;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.agent.EmailConfigurationRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.EmailConfiguration;

public class EmailConfigurationRepositoryQueryImpl extends BaseRepositoryQueryImpl<EmailConfiguration, Long>
    implements EmailConfigurationRepositoryQuery{

  protected EmailConfigurationRepositoryQueryImpl(Class<EmailConfiguration> businessClass) {
    super(businessClass);
  }

  public EmailConfigurationRepositoryQueryImpl() {
    super(EmailConfiguration.class);
  }
}
