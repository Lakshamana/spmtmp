package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IWorkGroupInstantiationSuggestionDAO;
import br.ufpa.labes.spm.domain.WorkGroupInstSug;

public class WorkGroupInstantiationSuggestionDAO extends BaseRepositoryQueryImpl<WorkGroupInstSug, Long>
    implements IWorkGroupInstantiationSuggestionDAO {

  protected WorkGroupInstantiationSuggestionDAO(Class<WorkGroupInstSug> businessClass) {
    super(businessClass);
  }

  public WorkGroupInstantiationSuggestionDAO() {
    super(WorkGroupInstSug.class);
  }
}
