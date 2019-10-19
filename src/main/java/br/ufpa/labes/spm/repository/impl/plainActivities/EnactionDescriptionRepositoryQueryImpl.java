package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IEnactionDescriptionRepositoryQuery;
import br.ufpa.labes.spm.domain.EnactionDescription;

public class EnactionDescriptionRepositoryQueryImpl extends BaseRepositoryQueryImpl<EnactionDescription, Long>
    implements IEnactionDescriptionRepositoryQuery {

  protected EnactionDescriptionRepositoryQueryImpl(Class<EnactionDescription> businessClass) {
    super(businessClass);
  }

  public EnactionDescriptionRepositoryQueryImpl() {
    super(EnactionDescription.class);
  }
}