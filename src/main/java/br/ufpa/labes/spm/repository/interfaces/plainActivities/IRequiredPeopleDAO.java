package br.ufpa.labes.spm.repository.interfaces.plainActivities;

import java.util.Collection;

import br.ufpa.labes.spm.repository.interfaces.BaseDAO;
import br.ufpa.labes.spm.domain.RequiredPeople;

public interface IRequiredPeopleDAO extends BaseDAO<RequiredPeople, Long> {
  public Collection<String> getReqPeopleEmails(String normalIdent);
}
