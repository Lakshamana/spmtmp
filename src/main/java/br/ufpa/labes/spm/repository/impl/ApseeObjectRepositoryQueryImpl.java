package br.ufpa.labes.spm.repository.impl;

import br.ufpa.labes.spm.repository.interfaces.ApseeObjectRepositoryQuery;

public class ApseeObjectRepositoryQueryImpl implements ObjectRepositoryQuery{
  public <T> T retrieve(Class<T> classe, String key) {
    return this.getPersistenceContext().find(classe, key);
  }
}
