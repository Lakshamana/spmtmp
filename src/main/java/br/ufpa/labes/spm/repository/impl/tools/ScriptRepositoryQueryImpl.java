package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.ScriptRepositoryQuery;
import br.ufpa.labes.spm.domain.Script;

public class ScriptRepositoryQueryImpl extends BaseRepositoryQueryImpl<Script, Long> implements ScriptRepositoryQuery{

  protected ScriptRepositoryQueryImpl(Class<Script> businessClass) {
    super(businessClass);
  }

  public ScriptRepositoryQueryImpl() {
    super(Script.class);
  }
}
