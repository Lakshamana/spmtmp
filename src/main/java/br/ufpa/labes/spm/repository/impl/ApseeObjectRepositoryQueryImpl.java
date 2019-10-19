package br.ufpa.labes.spm.repository.impl;

import br.ufpa.labes.spm.repository.interfaces.IApseeObjectRepositoryQuery;

public class ApseeObjectRepositoryQueryImpl extends BaseRepositoryQueryImpl<Object, Long> implements IApseeObjectRepositoryQuery {

  protected ApseeObjectRepositoryQueryImpl(Class<Object> businessClass) {
    super(businessClass);
  }

  public ApseeObjectRepositoryQueryImpl() {
    super(Object.class);
  }

  public <T> T retrieve(Class<T> classe, String key) {
    return this.getPersistenceContext().find(classe, key);
  }
}
