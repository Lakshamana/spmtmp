package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IReservationRepositoryQuery;
import br.ufpa.labes.spm.domain.Reservation;

public class ReservationRepositoryQuery extends BaseRepositoryQueryImpl<Reservation, Long> implements IReservationRepositoryQuery {

  protected ReservationRepositoryQuery(Class<Reservation> businessClass) {
    super(businessClass);
  }

  public ReservationRepositoryQuery() {
    super(Reservation.class);
  }
}
