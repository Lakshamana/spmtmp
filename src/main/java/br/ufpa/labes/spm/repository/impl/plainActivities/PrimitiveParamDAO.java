package br.ufpa.labes.spm.repository.impl.plainActivities;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IPrimitiveParamDAO;
import br.ufpa.labes.spm.domain.PrimitiveParam;

public class PrimitiveParamDAO extends BaseDAOImpl<PrimitiveParam, Long>
    implements IPrimitiveParamDAO {

  protected PrimitiveParamDAO(Class<PrimitiveParam> businessClass) {
    super(businessClass);
  }

  public PrimitiveParamDAO() {
    super(PrimitiveParam.class);
  }
}
