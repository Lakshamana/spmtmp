package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.calendar.CalendarRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Calendar;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Calendar entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CalendarRepository extends BaseRepositoryQuery<Calendar, Long>, JpaRepository<Calendar, Long> {

}
