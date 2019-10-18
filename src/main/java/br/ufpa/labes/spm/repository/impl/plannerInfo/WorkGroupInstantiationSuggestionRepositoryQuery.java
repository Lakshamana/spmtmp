package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IWorkGroupInstantiationSuggestionRepositoryQuery;
import br.ufpa.labes.spm.domain.WorkGroupInstSug;

public class WorkGroupInstantiationSuggestionRepositoryQuery extends BaseRepositoryQueryImpl<WorkGroupInstSug, Long>
    implements IWorkGroupInstantiationSuggestionRepositoryQuery {

  protected WorkGroupInstantiationSuggestionRepositoryQuery(Class<WorkGroupInstSug> businessClass) {
    super(businessClass);
  }

  public WorkGroupInstantiationSuggestionRepositoryQuery() {
    super(WorkGroupInstSug.class);
  }
}
