package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IModelingActivityEventRepositoryQuery;
import br.ufpa.labes.spm.domain.ModelingActivityEvent;

public class ModelingActivityEventRepositoryQueryImpl extends BaseRepositoryQueryImpl<ModelingActivityEvent, Long>
    implements IModelingActivityEventRepositoryQuery {

  protected ModelingActivityEventRepositoryQueryImpl(Class<ModelingActivityEvent> businessClass) {
    super(businessClass);
  }

  public ModelingActivityEventRepositoryQueryImpl() {
    super(ModelingActivityEvent.class);
  }
}
