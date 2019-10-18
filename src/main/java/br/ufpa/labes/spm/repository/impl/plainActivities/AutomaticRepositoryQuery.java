package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IAutomaticRepositoryQuery;
import br.ufpa.labes.spm.domain.Automatic;

public class AutomaticRepositoryQuery extends BaseRepositoryQueryImpl<Automatic, Long> implements IAutomaticRepositoryQuery {

  protected AutomaticRepositoryQuery(Class<Automatic> businessClass) {
    super(businessClass);
  }

  public AutomaticRepositoryQuery() {
    super(Automatic.class);
  }
}
