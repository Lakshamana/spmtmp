package br.ufpa.labes.spm.repository.interfaces.assets;

import java.util.List;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.domain.TagStats;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;

public interface TagStatsRepositoryQuery {

  public List<TagStats> retrieveMostVotedTags(int numResults);

  public List<TagStats> retrieveMostVotedTagsForAsset(String assetUid, int numResults);

  @Deprecated
  public TagStats retrieve(String key);

  @Deprecated
  public List<TagStats> retrieveByCriteria(TagStats searchCriteria);

  @Deprecated
  public List<TagStats> retrieveByCriteria(TagStats searchCriteria, SortCriteria sortCriteria);

  @Deprecated
  public List<TagStats> retrieveByCriteria(
      TagStats searchCriteria, SortCriteria sortCriteria, PagingContext paging);
}
