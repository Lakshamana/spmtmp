package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.SubroutineRepositoryQuery;
import br.ufpa.labes.spm.domain.Subroutine;

public class SubroutineRepositoryQueryImpl extends BaseRepositoryQueryImpl<Subroutine, Long> implements SubroutineRepositoryQuery{

  protected SubroutineRepositoryQueryImpl(Class<Subroutine> businessClass) {
    super(businessClass);
  }

  public SubroutineRepositoryQueryImpl() {
    super(Subroutine.class);
  }
}
