package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.FeedbackRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Feedback;

public class FeedbackRepositoryQueryImpl implements FeedbackRepositoryQuery {

  protected FeedbackRepositoryQueryImpl(Class<Feedback> businessClass) {
    super(businessClass);
  }

  public FeedbackRepositoryQueryImpl() {
    super(Feedback.class);
  }
}
