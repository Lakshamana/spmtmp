package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IScriptRepositoryQuery;
import br.ufpa.labes.spm.domain.Script;

public class ScriptRepositoryQueryImpl extends BaseRepositoryQueryImpl<Script, Long> implements IScriptRepositoryQuery {

  protected ScriptRepositoryQueryImpl(Class<Script> businessClass) {
    super(businessClass);
  }

  public ScriptRepositoryQueryImpl() {
    super(Script.class);
  }
}
