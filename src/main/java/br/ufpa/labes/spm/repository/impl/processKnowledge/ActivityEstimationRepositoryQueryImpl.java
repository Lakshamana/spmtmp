package br.ufpa.labes.spm.repository.impl.processKnowledge;

import java.util.List;

import javax.persistence.Query;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.IActivityEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.ActivityEstimation;

public class ActivityEstimationRepositoryQueryImpl extends BaseRepositoryQueryImpl<ActivityEstimation, Long>
    implements IActivityEstimationRepositoryQuery {

  private static final String ACTIVITY_METRIC_DEFINITION_NAME = "Activity Effort";

  protected ActivityEstimationRepositoryQueryImpl(Class<ActivityEstimation> businessClass) {
    super(businessClass);
  }

  public ActivityEstimationRepositoryQueryImpl() {
    super(ActivityEstimation.class);
  }

  public float getHoursEstimationForActivity(String normalIdent) {

    String queryString =
        "from "
            + ActivityEstimation.class.getName()
            + " as e where e.activity.ident = '"
            + normalIdent
            + "'"
            + " and e.metricDefinition.name = '"
            + ACTIVITY_METRIC_DEFINITION_NAME
            + "'";

    Query query = getPersistenceContext().createQuery(queryString);

    List<ActivityEstimation> estimations = query.getResultList();

    if (estimations == null || estimations.isEmpty()) return 0.0f;

    ActivityEstimation lastEstimation = estimations.get(estimations.size() - 1);

    return lastEstimation.getValue();
  }
}
