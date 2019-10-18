package br.ufpa.labes.spm.repository.impl.plainActivities;

import java.util.List;

import javax.persistence.Query;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.plainActivities.IReqWorkGroupDAO;
import br.ufpa.labes.spm.domain.ReqWorkGroup;

public class ReqWorkGroupDAO extends BaseRepositoryQueryImpl<ReqWorkGroup, Long> implements IReqWorkGroupDAO {

  protected ReqWorkGroupDAO(Class<ReqWorkGroup> businessClass) {
    super(businessClass);
  }

  public ReqWorkGroupDAO() {
    super(ReqWorkGroup.class);
  }

  public ReqWorkGroup findReqWorkGroupFromProcessModel(
      String groupIdent, String WorkgroupTypeIdent, String normalIdent) {
    List<ReqWorkGroup> retorno = null;

    if (groupIdent != null && !groupIdent.equals("")) {

      String hql =
          "SELECT ReqWorkGroup FROM "
              + ReqWorkGroup.class.getName()
              + " AS ReqWorkGroup WHERE ReqWorkGroup.theGroup.ident=:groupIdent AND ReqWorkGroup.theGroupType.ident=:WorkgroupTypeIdent AND ReqWorkGroup.theNormal.ident=:normalIdent";
      Query query = getPersistenceContext().createQuery(hql);
      query.setParameter("groupIdent", groupIdent);
      query.setParameter("groupTypeIdent", WorkgroupTypeIdent);
      query.setParameter("normalIdent", normalIdent);

      retorno = (List<ReqWorkGroup>) query.getResultList();
    } else {

      String hql =
          "SELECT ReqWorkGroup FROM "
              + ReqWorkGroup.class.getName()
              + " AS ReqWorkGroup WHERE ReqWorkGroup.theGroupType.ident=:WorkgroupTypeIdent AND ReqWorkGroup.theNormal.ident=:normalIdent";
      Query query = getPersistenceContext().createQuery(hql);
      query.setParameter("groupTypeIdent", WorkgroupTypeIdent);
      query.setParameter("normalIdent", normalIdent);

      retorno = (List<ReqWorkGroup>) query.getResultList();
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
