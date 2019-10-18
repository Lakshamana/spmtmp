package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IActivityInstantiatedDAO;
import br.ufpa.labes.spm.domain.ActivityInstantiated;

public class ActivityInstantiatedDAO extends BaseDAOImpl<ActivityInstantiated, Long>
    implements IActivityInstantiatedDAO {

  protected ActivityInstantiatedDAO(Class<ActivityInstantiated> businessClass) {
    super(businessClass);
  }

  public ActivityInstantiatedDAO() {
    super(ActivityInstantiated.class);
  }
}
