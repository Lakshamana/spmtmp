package br.ufpa.labes.spm.repository.interfaces.calendar;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Calendar;

public interface CalendarRepositoryQuery {

  String validNameProject(String name, Integer project_Oid);
}
