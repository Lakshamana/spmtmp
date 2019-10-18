package br.ufpa.labes.spm.repository.impl.types;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.types.IAbilityTypeDAO;
import br.ufpa.labes.spm.domain.AbilityType;

public class AbilityTypeDAO extends BaseDAOImpl<AbilityType, Long> implements IAbilityTypeDAO {

  protected AbilityTypeDAO(Class<AbilityType> businessClass) {
    super(businessClass);
  }

  public AbilityTypeDAO() {
    super(AbilityType.class);
  }
}
