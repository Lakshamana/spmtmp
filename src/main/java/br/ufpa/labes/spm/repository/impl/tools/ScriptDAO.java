package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IScriptDAO;
import br.ufpa.labes.spm.domain.Script;

public class ScriptDAO extends BaseDAOImpl<Script, Long> implements IScriptDAO {

  protected ScriptDAO(Class<Script> businessClass) {
    super(businessClass);
  }

  public ScriptDAO() {
    super(Script.class);
  }
}
