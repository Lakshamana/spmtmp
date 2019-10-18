package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IEnactionDescriptionDAO;
import br.ufpa.labes.spm.domain.EnactionDescription;

public class EnactionDescriptionDAO extends BaseDAOImpl<EnactionDescription, Long>
    implements IEnactionDescriptionDAO {

  protected EnactionDescriptionDAO(Class<EnactionDescription> businessClass) {
    super(businessClass);
  }

  public EnactionDescriptionDAO() {
    super(EnactionDescription.class);
  }
}
