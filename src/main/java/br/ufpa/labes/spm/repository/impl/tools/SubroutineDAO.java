package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.ISubroutineDAO;
import br.ufpa.labes.spm.domain.Subroutine;

public class SubroutineDAO extends BaseRepositoryQueryImpl<Subroutine, Long> implements ISubroutineDAO {

  protected SubroutineDAO(Class<Subroutine> businessClass) {
    super(businessClass);
  }

  public SubroutineDAO() {
    super(Subroutine.class);
  }
}
