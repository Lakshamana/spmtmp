package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IFeedbackDAO;
import br.ufpa.labes.spm.domain.Feedback;

public class FeedbackDAO extends BaseRepositoryQueryImpl<Feedback, Long> implements IFeedbackDAO {

  protected FeedbackDAO(Class<Feedback> businessClass) {
    super(businessClass);
  }

  public FeedbackDAO() {
    super(Feedback.class);
  }
}
