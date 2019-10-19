package br.ufpa.labes.spm.repository.impl.processKnowledge;

import java.util.List;

import javax.persistence.Query;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.processKnowledge.ProcessEstimationRepositoryQuery;
import br.ufpa.labes.spm.domain.ActivityEstimation;
import br.ufpa.labes.spm.domain.ProcessEstimation;

public class ProcessEstimationRepositoryQueryImpl extends BaseRepositoryQueryImpl<ProcessEstimation, Long>
    implements ProcessEstimationRepositoryQuery{

  private static final String ACTIVITY_METRIC_DEFINITION_NAME = "Activity Effort";

  protected ProcessEstimationRepositoryQueryImpl(Class<ProcessEstimation> businessClass) {
    super(businessClass);
  }

  public ProcessEstimationRepositoryQueryImpl() {
    super(ProcessEstimation.class);
  }

  @Override
  @SuppressWarnings("unchecked")
  public float getHoursEstimationForProject(String projectIdent) {

    String queryString =
        "from "
            + ActivityEstimation.class.getName()
            + " as e where e.activity.ident like '"
            + projectIdent
            + "%'"
            + " and e.metricDefinition.name = '"
            + ACTIVITY_METRIC_DEFINITION_NAME
            + "'";

    Query query = getPersistenceContext().createQuery(queryString);

    List<ActivityEstimation> estimations = query.getResultList();

    float total = 0.0f;

    if (estimations == null || estimations.isEmpty()) {
      return total;
    } else {
      for (ActivityEstimation estimation : estimations) {
        total += estimation.getValue();
      }
    }

    return total;
  }
}
