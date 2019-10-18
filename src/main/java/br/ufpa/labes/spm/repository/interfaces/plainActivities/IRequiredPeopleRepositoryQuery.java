package br.ufpa.labes.spm.repository.interfaces.plainActivities;

import java.util.Collection;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.RequiredPeople;

public interface IRequiredPeopleRepositoryQuery extends BaseRepositoryQuery<RequiredPeople, Long> {
  public Collection<String> getReqPeopleEmails(String normalIdent);
}
