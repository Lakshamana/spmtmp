package br.ufpa.labes.spm.repository.impl.organizationPolicies;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.INodeRepositoryQuery;
import br.ufpa.labes.spm.domain.Node;

public class NodeRepositoryQuery extends BaseRepositoryQueryImpl<Node, Long> implements INodeRepositoryQuery {

  protected NodeRepositoryQuery(Class<Node> businessClass) {
    super(businessClass);
  }

  public NodeRepositoryQuery() {
    super(Node.class);
  }
}
