package br.ufpa.labes.spm.repository.impl.plannerInfo;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.plannerInfo.IPeopleInstantiationSuggestionDAO;
import br.ufpa.labes.spm.domain.PeopleInstSug;

public class PeopleInstantiationSuggestionDAO extends BaseDAOImpl<PeopleInstSug, Long>
    implements IPeopleInstantiationSuggestionDAO {

  protected PeopleInstantiationSuggestionDAO(Class<PeopleInstSug> businessClass) {
    super(businessClass);
  }

  public PeopleInstantiationSuggestionDAO() {
    super(PeopleInstSug.class);
  }
}
