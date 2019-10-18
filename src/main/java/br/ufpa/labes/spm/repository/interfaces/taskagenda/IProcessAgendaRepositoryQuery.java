package br.ufpa.labes.spm.repository.interfaces.taskagenda;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Normal;
import br.ufpa.labes.spm.domain.ProcessAgenda;
import br.ufpa.labes.spm.domain.Task;

public interface IProcessAgendaRepositoryQuery extends BaseRepositoryQuery<ProcessAgenda, Long> {

  public Task addTask(ProcessAgenda pAgenda, Normal actNorm);
}