package br.ufpa.labes.spm.repository.impl.processModels;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processModels.ITemplateRepositoryQuery;
import br.ufpa.labes.spm.domain.Template;

public class TemplateRepositoryQuery extends BaseRepositoryQueryImpl<Template, Long> implements ITemplateRepositoryQuery {

  protected TemplateRepositoryQuery(Class<Template> businessClass) {
    super(businessClass);
  }

  public TemplateRepositoryQuery() {
    super(Template.class);
  }
}
