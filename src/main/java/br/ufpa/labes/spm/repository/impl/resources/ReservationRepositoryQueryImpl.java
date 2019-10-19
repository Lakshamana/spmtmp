package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.IReservationRepositoryQuery;
import br.ufpa.labes.spm.domain.Reservation;

public class ReservationRepositoryQueryImpl extends BaseRepositoryQueryImpl<Reservation, Long> implements IReservationRepositoryQuery {

  protected ReservationRepositoryQueryImpl(Class<Reservation> businessClass) {
    super(businessClass);
  }

  public ReservationRepositoryQueryImpl() {
    super(Reservation.class);
  }
}
