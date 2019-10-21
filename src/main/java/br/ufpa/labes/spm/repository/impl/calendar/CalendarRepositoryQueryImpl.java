package br.ufpa.labes.spm.repository.impl.calendar;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.calendar.CalendarRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Calendar;

public class CalendarRepositoryQueryImpl implements CalendarRepositoryQuery {

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
