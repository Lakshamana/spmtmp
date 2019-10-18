package br.ufpa.labes.spm.repository.impl.connections;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.connections.ISequenceDAO;
import br.ufpa.labes.spm.domain.Sequence;

public class SequenceDAO extends BaseRepositoryQueryImpl<Sequence, Long> implements ISequenceDAO {

  protected SequenceDAO(Class<Sequence> businessClass) {
    super(businessClass);
  }

  public SequenceDAO() {
    super(Sequence.class);
  }
}
