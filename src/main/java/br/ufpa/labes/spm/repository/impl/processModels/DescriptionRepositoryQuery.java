package br.ufpa.labes.spm.repository.impl.processModels;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processModels.IDescriptionRepositoryQuery;
import br.ufpa.labes.spm.domain.Description;

public class DescriptionRepositoryQuery extends BaseRepositoryQueryImpl<Description, Long> implements IDescriptionRepositoryQuery {

  protected DescriptionRepositoryQuery(Class<Description> businessClass) {
    super(businessClass);
  }

  public DescriptionRepositoryQuery() {
    super(Description.class);
  }
}
