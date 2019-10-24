package br.ufpa.labes.spm.repository.impl.resources;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.resources.ReservationRepositoryQuery;
import br.ufpa.labes.spm.domain.Reservation;

public class ReservationRepositoryQueryImpl implements ReservationRepositoryQuery{

  protected ReservationRepositoryQueryImpl(Class<Reservation> businessClass) {
    super(businessClass);
  }

  public ReservationRepositoryQueryImpl() {
    super(Reservation.class);
  }
}
