package br.ufpa.labes.spm.repository.interfaces.plainActivities;

import br.ufpa.labes.spm.repository.interfaces.BaseDAO;
import br.ufpa.labes.spm.domain.RequiredResource;

public interface IRequiredResourceDAO extends BaseDAO<RequiredResource, Long> {

  public RequiredResource findRequiredResourceFromProcessModel(
      String resourceIdent, String resourceTypeIdent, String normalIdent);
}
