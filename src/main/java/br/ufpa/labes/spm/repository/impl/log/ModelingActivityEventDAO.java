package br.ufpa.labes.spm.repository.impl.log;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.log.IModelingActivityEventDAO;
import br.ufpa.labes.spm.domain.ModelingActivityEvent;

public class ModelingActivityEventDAO extends BaseDAOImpl<ModelingActivityEvent, Long>
    implements IModelingActivityEventDAO {

  protected ModelingActivityEventDAO(Class<ModelingActivityEvent> businessClass) {
    super(businessClass);
  }

  public ModelingActivityEventDAO() {
    super(ModelingActivityEvent.class);
  }
}
