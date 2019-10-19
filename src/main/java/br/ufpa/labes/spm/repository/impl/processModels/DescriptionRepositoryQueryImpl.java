package br.ufpa.labes.spm.repository.impl.processModels;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processModels.IDescriptionRepositoryQuery;
import br.ufpa.labes.spm.domain.Description;

public class DescriptionRepositoryQueryImpl extends BaseRepositoryQueryImpl<Description, Long> implements IDescriptionRepositoryQuery {

  protected DescriptionRepositoryQueryImpl(Class<Description> businessClass) {
    super(businessClass);
  }

  public DescriptionRepositoryQueryImpl() {
    super(Description.class);
  }
}
