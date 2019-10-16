package br.ufpa.labes.spm.repository.interfaces;

public interface IApseeObjectDAO extends IBaseDAO<Object, Long> {

  public <T> T retrieve(Class<T> classe, String key);
}
