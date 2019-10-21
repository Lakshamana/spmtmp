package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.AutomaticRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Automatic;

public class AutomaticRepositoryQueryImpl extends BaseRepositoryQueryImpl<Automatic, Long> implements AutomaticRepositoryQuery {

  protected AutomaticRepositoryQueryImpl(Class<Automatic> businessClass) {
    super(businessClass);
  }

  public AutomaticRepositoryQueryImpl() {
    super(Automatic.class);
  }
}
