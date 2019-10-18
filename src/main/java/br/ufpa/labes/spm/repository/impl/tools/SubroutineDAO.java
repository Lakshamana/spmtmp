package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.ISubroutineDAO;
import br.ufpa.labes.spm.domain.Subroutine;

public class SubroutineDAO extends BaseDAOImpl<Subroutine, Long> implements ISubroutineDAO {

  protected SubroutineDAO(Class<Subroutine> businessClass) {
    super(businessClass);
  }

  public SubroutineDAO() {
    super(Subroutine.class);
  }
}
