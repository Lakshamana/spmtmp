package br.ufpa.labes.spm.repository.impl.assets;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.assets.IRelationshipKindRepositoryQuery;
import br.ufpa.labes.spm.domain.RelationshipKind;

public class RelationshipKindRepositoryQuery extends BaseRepositoryQueryImpl<RelationshipKind, Long>
    implements IRelationshipKindRepositoryQuery {

  public RelationshipKindRepositoryQuery() {
    super(RelationshipKind.class);
  }
}
