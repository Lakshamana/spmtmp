package br.ufpa.labes.spm.repository.impl.assets;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.assets.IRelationshipKindDAO;
import br.ufpa.labes.spm.domain.RelationshipKind;

public class RelationshipKindDAO extends BaseRepositoryQueryImpl<RelationshipKind, Long>
    implements IRelationshipKindDAO {

  public RelationshipKindDAO() {
    super(RelationshipKind.class);
  }
}
