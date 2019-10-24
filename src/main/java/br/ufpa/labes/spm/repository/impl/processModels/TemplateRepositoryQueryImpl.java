package br.ufpa.labes.spm.repository.impl.processModels;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processModels.TemplateRepositoryQuery;
import br.ufpa.labes.spm.domain.Template;

public class TemplateRepositoryQueryImpl implements TemplateRepositoryQuery{

  protected TemplateRepositoryQueryImpl(Class<Template> businessClass) {
    super(businessClass);
  }

  public TemplateRepositoryQueryImpl() {
    super(Template.class);
  }
}
