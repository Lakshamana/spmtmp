package br.ufpa.labes.spm.repository.interfaces.processModelGraphic;

import java.util.Collection;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.exceptions.DAOException;
import br.ufpa.labes.spm.domain.GraphicCoordinate;

public interface IGraphicCoordinateDAO extends BaseRepositoryQuery<GraphicCoordinate, Long> {

  public Collection<GraphicCoordinate> getProcessCoordinates(String processId) throws DAOException;
}
