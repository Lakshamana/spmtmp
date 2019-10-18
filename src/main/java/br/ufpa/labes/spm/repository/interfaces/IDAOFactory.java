package br.ufpa.labes.spm.repository.interfaces;

import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.beans.factory.annotation.Autowired;

import br.ufpa.labes.spm.repository.ActivityRepository;
import br.ufpa.labes.spm.repository.DecomposedRepository;
import br.ufpa.labes.spm.repository.interfaces.activities.IActivityRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.activities.IDecomposedRepositoryQuery;

public class IRepositoryQueryFactory {

  @Autowired
  private ActivityRepository activityRepository;

  @SuppressWarnings("unused")
  @Autowired
  private DecomposedRepository decomposedRepository;

  public IRepositoryQueryFactory() {
    try {
      Properties properties = new Properties();
      InitialContext context = new InitialContext(properties);
      Object obj = context.lookup("ActivityRepositoryQueryLocal");
      activityRepository = (ActivityRepository) obj;
    } catch (NamingException e) {
      e.printStackTrace();
    }
  }

  public Object getIDAO(String RepositoryQueryName) {
    // TO-DO
    return activityRepository;
  }
}
