package br.ufpa.labes.spm.repository.impl.processModels;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.processModels.ITemplateDAO;
import br.ufpa.labes.spm.domain.Template;

public class TemplateDAO extends BaseDAOImpl<Template, Long> implements ITemplateDAO {

  protected TemplateDAO(Class<Template> businessClass) {
    super(businessClass);
  }

  public TemplateDAO() {
    super(Template.class);
  }
}
