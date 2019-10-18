package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IInstantiationSuggestionDAO;
import br.ufpa.labes.spm.domain.InstantiationSuggestion;

public class InstantiationSuggestionDAO extends BaseDAOImpl<InstantiationSuggestion, Long>
    implements IInstantiationSuggestionDAO {

  protected InstantiationSuggestionDAO(Class<InstantiationSuggestion> businessClass) {
    super(businessClass);
  }

  public InstantiationSuggestionDAO() {
    super(InstantiationSuggestion.class);
  }
}
