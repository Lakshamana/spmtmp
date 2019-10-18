package br.ufpa.labes.spm.repository.interfaces.processModelGraphic;

import java.util.Collection;

import br.ufpa.labes.spm.repository.interfaces.BaseDAO;
import br.ufpa.labes.spm.exceptions.DAOException;
import br.ufpa.labes.spm.domain.GraphicCoordinate;
import br.ufpa.labes.spm.domain.WebAPSEEObject;

public interface IWebAPSEEObjectDAO extends BaseDAO<WebAPSEEObject, Long> {

  public WebAPSEEObject retrieveWebAPSEEObject(Long theReferredOid, String className)
      throws DAOException;

  public Collection<GraphicCoordinate> retrieveProcessCoordinates(String processId)
      throws DAOException;
}
