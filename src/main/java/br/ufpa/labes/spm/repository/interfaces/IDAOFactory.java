package br.ufpa.labes.spm.repository.interfaces;

import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.ufpa.labes.spm.repository.interfaces.activities.IActivityDAO;
import br.ufpa.labes.spm.repository.interfaces.activities.IDecomposedDAO;

public class IDAOFactory {

  @Autowired
  private IActivtyRepository iActivityRepository;

  @SuppressWarnings("unused")
  @Autowired
  private DecomposedRepository iDecomposedRepository;

  public IDAOFactory() {
    try {
      Properties properties = new Properties();
      InitialContext context = new InitialContext(properties);
      Object obj = context.lookup("ActivityDAOLocal");
      iActivityDAO = (IActivityDAO) obj;
    } catch (NamingException e) {
      e.printStackTrace();
    }
  }

  public Object getIDAO(String daoName) {
    // TO-DO
    return iActivityDAO;
  }
}
