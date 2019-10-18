package br.ufpa.labes.spm.repository.impl.processModelGraphical;

import java.util.Collection;
import java.util.List;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.processModelGraphic.IGraphicCoordinateDAO;
import br.ufpa.labes.spm.exceptions.DAOException;
import br.ufpa.labes.spm.domain.GraphicCoordinate;

public class GraphicCoordinateDAO extends BaseDAOImpl<GraphicCoordinate, Long>
    implements IGraphicCoordinateDAO {

  protected GraphicCoordinateDAO(Class<GraphicCoordinate> businessClass) {
    super(businessClass);
  }

  public GraphicCoordinateDAO() {
    super(GraphicCoordinate.class);
  }

  @Override
  public Collection<GraphicCoordinate> getProcessCoordinates(String processId) throws DAOException {
    List<GraphicCoordinate> objs =
        this.getPersistenceContext()
            .createQuery(
                "FROM "
                    + super.getBusinessClass().getName()
                    + " as obj WHERE obj.theProcess = '"
                    + processId
                    + "'")
            .getResultList();
    return objs;
  }
}
