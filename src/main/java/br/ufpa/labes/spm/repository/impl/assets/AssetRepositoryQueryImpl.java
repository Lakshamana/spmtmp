package br.ufpa.labes.spm.repository.impl.assets;

import java.util.List;

import javax.persistence.Query;

import br.ufpa.labes.spm.repository.impl.BaseRepositoryQueryImpl;
import br.ufpa.labes.spm.repository.interfaces.assets.AssetRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.Asset;
import br.ufpa.labes.spm.domain.AssetRelationship;
// import org.qrconsult.spm.vo.AssetCatalog;

public class AssetRepositoryQueryImpl extends BaseRepositoryQueryImpl<Asset, Long> implements AssetRepositoryQuery {

  public AssetRepositoryQueryImpl() {
    super(Asset.class);
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<AssetRelationship> retrieveRelatedAssetsTo(String assetUid) {
    String queryStr =
        "from "
            + AssetRelationship.class.getName()
            + " as assetRel "
            + "where assetRel.asset.uid = :assetUid order by assetRel.relatedAsset.name";

    Query query = this.getPersistenceContext().createQuery(queryStr);
    query.setParameter("assetUid", assetUid);

    return query.getResultList();
  }

  // @Override
  // public AssetCatalog retrieveAssetForCatalog(AssetCatalog catalog) {
  // 	return null;
  // }

}
