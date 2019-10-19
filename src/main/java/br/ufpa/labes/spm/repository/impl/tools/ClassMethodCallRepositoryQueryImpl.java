package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IClassMethodCallRepositoryQuery;
import br.ufpa.labes.spm.domain.ClassMethodCall;

public class ClassMethodCallRepositoryQueryImpl extends BaseRepositoryQueryImpl<ClassMethodCall, Long>
    implements IClassMethodCallRepositoryQuery {

  protected ClassMethodCallRepositoryQueryImpl(Class<ClassMethodCall> businessClass) {
    super(businessClass);
  }

  public ClassMethodCallRepositoryQueryImpl() {
    super(ClassMethodCall.class);
  }
}
