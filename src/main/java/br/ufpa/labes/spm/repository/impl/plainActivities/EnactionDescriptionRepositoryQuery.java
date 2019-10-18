package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IEnactionDescriptionRepositoryQuery;
import br.ufpa.labes.spm.domain.EnactionDescription;

public class EnactionDescriptionRepositoryQuery extends BaseRepositoryQueryImpl<EnactionDescription, Long>
    implements IEnactionDescriptionRepositoryQuery {

  protected EnactionDescriptionRepositoryQuery(Class<EnactionDescription> businessClass) {
    super(businessClass);
  }

  public EnactionDescriptionRepositoryQuery() {
    super(EnactionDescription.class);
  }
}
