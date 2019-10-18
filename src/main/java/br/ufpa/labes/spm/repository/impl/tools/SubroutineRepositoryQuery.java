package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.ISubroutineRepositoryQuery;
import br.ufpa.labes.spm.domain.Subroutine;

public class SubroutineRepositoryQuery extends BaseRepositoryQueryImpl<Subroutine, Long> implements ISubroutineRepositoryQuery {

  protected SubroutineRepositoryQuery(Class<Subroutine> businessClass) {
    super(businessClass);
  }

  public SubroutineRepositoryQuery() {
    super(Subroutine.class);
  }
}
