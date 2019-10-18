package br.ufpa.labes.spm.repository.interfaces;

public interface IApseeObjectDAO extends BaseDAO<Object, Long> {

  public <T> T retrieve(Class<T> classe, String key);
}
