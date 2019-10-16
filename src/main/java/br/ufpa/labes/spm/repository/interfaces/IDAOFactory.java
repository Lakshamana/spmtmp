package br.ufpa.labes.spm.repository.interfaces;

import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.beans.factory.annotation.Autowired;

import br.ufpa.labes.spm.repository.ActivityRepository;
import br.ufpa.labes.spm.repository.DecomposedRepository;
import br.ufpa.labes.spm.repository.interfaces.activities.IActivityDAO;
import br.ufpa.labes.spm.repository.interfaces.activities.IDecomposedDAO;

public class IDAOFactory {

  @Autowired
  private ActivityRepository activityRepository;

  @SuppressWarnings("unused")
  @Autowired
  private DecomposedRepository decomposedRepository;

  public IDAOFactory() {
    try {
      Properties properties = new Properties();
      InitialContext context = new InitialContext(properties);
      Object obj = context.lookup("ActivityDAOLocal");
      activityRepository = (ActivityRepository) obj;
    } catch (NamingException e) {
      e.printStackTrace();
    }
  }

  public Object getIDAO(String daoName) {
    // TO-DO
    return activityRepository;
  }
}
