package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IAutomaticRepositoryQuery;
import br.ufpa.labes.spm.domain.Automatic;

public class AutomaticRepositoryQueryImpl extends BaseRepositoryQueryImpl<Automatic, Long> implements IAutomaticRepositoryQuery {

  protected AutomaticRepositoryQueryImpl(Class<Automatic> businessClass) {
    super(businessClass);
  }

  public AutomaticRepositoryQueryImpl() {
    super(Automatic.class);
  }
}
