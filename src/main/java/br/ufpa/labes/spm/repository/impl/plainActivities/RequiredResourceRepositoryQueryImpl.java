package br.ufpa.labes.spm.repository.impl.plainActivities;

import java.util.List;

import javax.persistence.Query;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.RequiredResourceRepositoryQuery;
import br.ufpa.labes.spm.domain.RequiredResource;

public class RequiredResourceRepositoryQueryImpl extends BaseRepositoryQueryImpl<RequiredResource, Long>
    implements RequiredResourceRepositoryQuery{
  public RequiredResource findRequiredResourceFromProcessModel(
      String resourceIdent, String resourceTypeIdent, String normalIdent) {
    List<RequiredResource> retorno = null;

    if (resourceIdent != null && !resourceIdent.equals("")) {

      String hql =
          "SELECT reqResource FROM "
              + RequiredResource.class.getName()
              + " AS reqResource WHERE reqResource.theResource.ident=:resourceIdent AND reqResource.theResourceType.ident=:resourceTypeIdent AND reqResource.theNormal.ident=:normalIdent";
      Query query = getPersistenceContext().createQuery(hql);
      query.setParameter("resourceIdent", resourceIdent);
      query.setParameter("resourceTypeIdent", resourceTypeIdent);
      query.setParameter("normalIdent", normalIdent);

      retorno = (List<RequiredResource>) query.getResultList();
      System.out.println("findRequiredResourceFromProcessModel if");
      System.out.println(retorno);
    } else {

      String hql =
          "SELECT reqResource FROM "
              + RequiredResource.class.getName()
              + " AS reqResource WHERE reqResource.theResourceType.ident=:resourceTypeIdent AND reqResource.theNormal.ident=:normalIdent";
      Query query = getPersistenceContext().createQuery(hql);
      query.setParameter("resourceTypeIdent", resourceTypeIdent);
      query.setParameter("normalIdent", normalIdent);

      retorno = (List<RequiredResource>) query.getResultList();
      System.out.println("findRequiredResourceFromProcessModel else");
      System.out.println(retorno);
    }

    if (retorno != null) {
      if (!retorno.isEmpty()) {
        return retorno.get(0);
      } else {
        return null;
      }
    } else return null;
  }
}
