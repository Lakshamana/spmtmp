package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.ClassMethodCallRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.ClassMethodCall;

public class ClassMethodCallRepositoryQueryImpl extends BaseRepositoryQueryImpl<ClassMethodCall, Long>
    implements ClassMethodCallRepositoryQuery{

  protected ClassMethodCallRepositoryQueryImpl(Class<ClassMethodCall> businessClass) {
    super(businessClass);
  }

  public ClassMethodCallRepositoryQueryImpl() {
    super(ClassMethodCall.class);
  }
}
