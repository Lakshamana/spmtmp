package br.ufpa.labes.spm.repository.impl.calendar;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.calendar.ICalendarRepositoryQuery;
import br.ufpa.labes.spm.domain.Calendar;

public class CalendarRepositoryQueryImpl extends BaseRepositoryQueryImpl<Calendar, Long> implements ICalendarRepositoryQuery {

  protected CalendarRepositoryQueryImpl(Class<Calendar> businessClass) {
    super(businessClass);
  }

  public CalendarRepositoryQueryImpl() {
    super(Calendar.class);
  }

  @Override
  public String validNameProject(String name, Integer project_Oid) {
    // TODO Auto-generated method stub
    return null;
  }
}
