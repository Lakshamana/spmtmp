package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IResourceInstantiationSuggestionDAO;
import br.ufpa.labes.spm.domain.ResourceInstSug;

public class ResourceInstantiationSuggestionDAO extends BaseDAOImpl<ResourceInstSug, Long>
    implements IResourceInstantiationSuggestionDAO {

  protected ResourceInstantiationSuggestionDAO(Class<ResourceInstSug> businessClass) {
    super(businessClass);
  }

  public ResourceInstantiationSuggestionDAO() {
    super(ResourceInstSug.class);
  }
}
