package br.ufpa.labes.spm.repository.impl.assets;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.assets.RelationshipKindRepositoryQuery;
import br.ufpa.labes.spm.domain.RelationshipKind;

public class RelationshipKindRepositoryQueryImpl extends BaseRepositoryQueryImpl<RelationshipKind, Long>
    implements RelationshipKindRepositoryQuery{

  public RelationshipKindRepositoryQueryImpl() {
    super(RelationshipKind.class);
  }
}
