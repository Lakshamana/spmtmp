package br.ufpa.labes.spm.repository.interfaces.calendar;

import br.ufpa.labes.spm.repository.interfaces.BaseDAO;
import br.ufpa.labes.spm.domain.Calendar;

public interface ICalendarDAO extends BaseDAO<Calendar, Long> {

  String validNameProject(String name, Integer project_Oid);
}
