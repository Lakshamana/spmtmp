package br.ufpa.labes.spm.repository.impl.processModels;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processModels.IDescriptionDAO;
import br.ufpa.labes.spm.domain.Description;

public class DescriptionDAO extends BaseRepositoryQueryImpl<Description, Long> implements IDescriptionDAO {

  protected DescriptionDAO(Class<Description> businessClass) {
    super(businessClass);
  }

  public DescriptionDAO() {
    super(Description.class);
  }
}
