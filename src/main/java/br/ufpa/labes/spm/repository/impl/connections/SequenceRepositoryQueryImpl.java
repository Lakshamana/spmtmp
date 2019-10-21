package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.SequenceRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Sequence;

public class SequenceRepositoryQueryImpl implements SequenceRepositoryQuery {

  protected SequenceRepositoryQueryImpl(Class<Sequence> businessClass) {
    super(businessClass);
  }

  public SequenceRepositoryQueryImpl() {
    super(Sequence.class);
  }
}
