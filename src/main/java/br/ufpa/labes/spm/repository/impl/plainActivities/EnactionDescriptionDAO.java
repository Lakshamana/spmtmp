package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IEnactionDescriptionDAO;
import br.ufpa.labes.spm.domain.EnactionDescription;

public class EnactionDescriptionDAO extends BaseRepositoryQueryImpl<EnactionDescription, Long>
    implements IEnactionDescriptionDAO {

  protected EnactionDescriptionDAO(Class<EnactionDescription> businessClass) {
    super(businessClass);
  }

  public EnactionDescriptionDAO() {
    super(EnactionDescription.class);
  }
}
