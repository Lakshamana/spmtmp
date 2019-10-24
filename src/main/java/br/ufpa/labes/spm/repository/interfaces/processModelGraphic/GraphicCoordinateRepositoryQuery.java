package br.ufpa.labes.spm.repository.interfaces.processModelGraphic;

import java.util.Collection;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.exceptions.RepositoryQueryException;
import br.ufpa.labes.spm.domain.GraphicCoordinate;

public interface GraphicCoordinateRepositoryQuery {

  public Collection<GraphicCoordinate> getProcessCoordinates(String processId) throws RepositoryQueryException;
}
