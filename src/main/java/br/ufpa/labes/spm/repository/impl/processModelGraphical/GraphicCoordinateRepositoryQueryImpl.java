package br.ufpa.labes.spm.repository.impl.processModelGraphical;

import java.util.Collection;
import java.util.List;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processModelGraphic.IGraphicCoordinateRepositoryQuery;
import br.ufpa.labes.spm.exceptions.RepositoryQueryException;
import br.ufpa.labes.spm.domain.GraphicCoordinate;

public class GraphicCoordinateRepositoryQueryImpl extends BaseRepositoryQueryImpl<GraphicCoordinate, Long>
    implements IGraphicCoordinateRepositoryQuery {

  protected GraphicCoordinateRepositoryQueryImpl(Class<GraphicCoordinate> businessClass) {
    super(businessClass);
  }

  public GraphicCoordinateRepositoryQueryImpl() {
    super(GraphicCoordinate.class);
  }

  @Override
  public Collection<GraphicCoordinate> getProcessCoordinates(String processId) throws RepositoryQueryException {
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
