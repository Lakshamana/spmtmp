package br.ufpa.labes.spm.repository.impl.tools;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.tools.IClassMethodCallDAO;
import br.ufpa.labes.spm.domain.ClassMethodCall;

public class ClassMethodCallDAO extends BaseDAOImpl<ClassMethodCall, Long>
    implements IClassMethodCallDAO {

  protected ClassMethodCallDAO(Class<ClassMethodCall> businessClass) {
    super(businessClass);
  }

  public ClassMethodCallDAO() {
    super(ClassMethodCall.class);
  }
}
