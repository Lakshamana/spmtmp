package br.ufpa.labes.spm.repository.interfaces;

public interface IApseeObjectRepositoryQuery extends BaseRepositoryQuery<Object, Long> {

  public <T> T retrieve(Class<T> classe, String key);
}