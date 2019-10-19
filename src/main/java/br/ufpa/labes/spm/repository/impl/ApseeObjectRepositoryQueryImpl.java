package br.ufpa.labes.spm.repository.impl;

import br.ufpa.labes.spm.repository.interfaces.IApseeObjectRepositoryQuery;

public class ApseeObjectRepositoryQuery extends BaseRepositoryQueryImpl<Object, Long> implements IApseeObjectRepositoryQuery {

  protected ApseeObjectRepositoryQuery(Class<Object> businessClass) {
    super(businessClass);
  }

  public ApseeObjectRepositoryQuery() {
    super(Object.class);
  }

  public <T> T retrieve(Class<T> classe, String key) {
    return this.getPersistenceContext().find(classe, key);
  }
}
