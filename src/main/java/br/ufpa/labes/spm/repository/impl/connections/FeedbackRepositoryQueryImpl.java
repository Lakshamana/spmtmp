package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IFeedbackRepositoryQuery;
import br.ufpa.labes.spm.domain.Feedback;

public class FeedbackRepositoryQueryImpl extends BaseRepositoryQueryImpl<Feedback, Long> implements IFeedbackRepositoryQuery {

  protected FeedbackRepositoryQueryImpl(Class<Feedback> businessClass) {
    super(businessClass);
  }

  public FeedbackRepositoryQueryImpl() {
    super(Feedback.class);
  }
}
