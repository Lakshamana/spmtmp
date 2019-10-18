package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseDAOImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IFeedbackDAO;
import br.ufpa.labes.spm.domain.Feedback;

public class FeedbackDAO extends BaseDAOImpl<Feedback, Long> implements IFeedbackDAO {

  protected FeedbackDAO(Class<Feedback> businessClass) {
    super(businessClass);
  }

  public FeedbackDAO() {
    super(Feedback.class);
  }
}
