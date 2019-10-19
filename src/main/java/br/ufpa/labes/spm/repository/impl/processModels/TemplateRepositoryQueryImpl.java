package br.ufpa.labes.spm.repository.impl.processModels;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processModels.ITemplateRepositoryQuery;
import br.ufpa.labes.spm.domain.Template;

public class TemplateRepositoryQueryImpl extends BaseRepositoryQueryImpl<Template, Long> implements ITemplateRepositoryQuery {

  protected TemplateRepositoryQueryImpl(Class<Template> businessClass) {
    super(businessClass);
  }

  public TemplateRepositoryQueryImpl() {
    super(Template.class);
  }
}
