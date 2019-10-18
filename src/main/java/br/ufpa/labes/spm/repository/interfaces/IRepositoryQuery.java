package br.ufpa.labes.spm.repository.interfaces;

public class IRepositoryQuery {

  private static IDAOFactory RepositoryQueryFactory;

  public IRepositoryQuery() {};

  public static IRepositoryQueryFactory getInstance() {
    if (RepositoryQueryFactory == null) {
      daoFactory = new IRepositoryQueryFactory();
    }
    return RepositoryQueryFactory;
  }
}
