package br.ufpa.labes.spm.repository.interfaces.taskagenda;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.service.dto.dashboard.Time;
import br.ufpa.labes.spm.domain.Task;

public interface TaskRepositoryQuery {
  public float getWorkingHoursForTask(String normalIdent, String agentIdent);

  public Time getWorkingHoursForTask2(String normalIdent, String agentIdent);
}
