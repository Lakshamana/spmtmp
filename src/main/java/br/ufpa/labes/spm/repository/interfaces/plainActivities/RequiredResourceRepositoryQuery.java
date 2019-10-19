package br.ufpa.labes.spm.repository.interfaces.plainActivities;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.RequiredResource;

public interface RequiredResourceRepositoryQuery extends BaseRepositoryQuery<RequiredResource, Long> {

  public RequiredResource findRequiredResourceFromProcessModel(
      String resourceIdent, String resourceTypeIdent, String normalIdent);
}
