package br.ufpa.labes.spm.repository.impl.organizationPolicies;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.organizationPolicies.NodeRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Node;

public class NodeRepositoryQueryImpl implements NodeRepositoryQuery {

  protected NodeRepositoryQueryImpl(Class<Node> businessClass) {
    super(businessClass);
  }

  public NodeRepositoryQueryImpl() {
    super(Node.class);
  }
}
