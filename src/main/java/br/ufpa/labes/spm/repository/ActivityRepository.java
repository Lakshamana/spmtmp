package br.ufpa.labes.spm.repository;

import br.ufpa.labes.spm.repository.interfaces.activities.ActivityRepositoryQuery;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;


import br.ufpa.labes.spm.domain.Activity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data  repository for the Activity entity.
 */
@Repository
public interface ActivityRepository extends BaseRepositoryQuery<Activity, Long>, JpaRepository<Activity, Long> {

    @Query(value = "select distinct activity from Activity activity left join fetch activity.toJoinCons left join fetch activity.fromBranchANDCons left join fetch activity.fromArtifactCons left join fetch activity.toArtifactCons",
        countQuery = "select count(distinct activity) from Activity activity")
    Page<Activity> findAllWithEagerRelationships(Pageable pageable);

    @Query("select distinct activity from Activity activity left join fetch activity.toJoinCons left join fetch activity.fromBranchANDCons left join fetch activity.fromArtifactCons left join fetch activity.toArtifactCons")
    List<Activity> findAllWithEagerRelationships();

    @Query("select activity from Activity activity left join fetch activity.toJoinCons left join fetch activity.fromBranchANDCons left join fetch activity.fromArtifactCons left join fetch activity.toArtifactCons where activity.id =:id")
    Optional<Activity> findOneWithEagerRelationships(@Param("id") Long id);

}
