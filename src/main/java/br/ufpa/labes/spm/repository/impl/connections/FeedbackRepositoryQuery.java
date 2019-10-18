package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.IFeedbackRepositoryQuery;
import br.ufpa.labes.spm.domain.Feedback;

public class FeedbackRepositoryQuery extends BaseRepositoryQueryImpl<Feedback, Long> implements IFeedbackRepositoryQuery {

  protected FeedbackRepositoryQuery(Class<Feedback> businessClass) {
    super(businessClass);
  }

  public FeedbackRepositoryQuery() {
    super(Feedback.class);
  }
}
