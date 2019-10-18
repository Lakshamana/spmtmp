package br.ufpa.labes.spm.repository.impl.processModels;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.processModels.IDescriptionDAO;
import br.ufpa.labes.spm.domain.Description;

public class DescriptionDAO extends BaseDAOImpl<Description, Long> implements IDescriptionDAO {

  protected DescriptionDAO(Class<Description> businessClass) {
    super(businessClass);
  }

  public DescriptionDAO() {
    super(Description.class);
  }
}
