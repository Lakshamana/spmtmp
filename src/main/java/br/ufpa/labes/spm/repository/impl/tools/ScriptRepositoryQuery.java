package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IScriptRepositoryQuery;
import br.ufpa.labes.spm.domain.Script;

public class ScriptRepositoryQuery extends BaseRepositoryQueryImpl<Script, Long> implements IScriptRepositoryQuery {

  protected ScriptRepositoryQuery(Class<Script> businessClass) {
    super(businessClass);
  }

  public ScriptRepositoryQuery() {
    super(Script.class);
  }
}
