package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IClassMethodCallRepositoryQuery;
import br.ufpa.labes.spm.domain.ClassMethodCall;

public class ClassMethodCallRepositoryQuery extends BaseRepositoryQueryImpl<ClassMethodCall, Long>
    implements IClassMethodCallRepositoryQuery {

  protected ClassMethodCallRepositoryQuery(Class<ClassMethodCall> businessClass) {
    super(businessClass);
  }

  public ClassMethodCallRepositoryQuery() {
    super(ClassMethodCall.class);
  }
}
