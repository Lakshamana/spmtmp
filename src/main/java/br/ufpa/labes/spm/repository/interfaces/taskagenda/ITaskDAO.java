package br.ufpa.labes.spm.repository.interfaces.taskagenda;

import br.ufpa.labes.spm.repository.interfaces.IBaseDAO;
import br.ufpa.labes.spm.service.dto.dashboard.Time;
import br.ufpa.labes.spm.domain.Task;

public interface ITaskDAO extends IBaseDAO<Task, Long> {
  public float getWorkingHoursForTask(String normalIdent, String agentIdent);

  public Time getWorkingHoursForTask2(String normalIdent, String agentIdent);
}
