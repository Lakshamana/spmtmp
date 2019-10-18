package br.ufpa.labes.spm.service.interfaces;

import java.util.Map;


import br.ufpa.labes.spm.service.dto.SimpleArtifactDescriptorDTO;
import br.ufpa.labes.spm.service.dto.ArtifactDTO;
import br.ufpa.labes.spm.service.dto.ArtifactsDTO;
import br.ufpa.labes.spm.service.dto.TypesDTO;
import br.ufpa.labes.spm.exceptions.RepositoryQueryException;

public interface ArtifactServices {

	public ArtifactDTO getArtifact(String artifactIdent);

	public ArtifactsDTO getArtifacts();

	public ArtifactsDTO getArtifactsWithoutRelationship(boolean composicao);

	public ArtifactsDTO getArtifacts(String termoBusca, String domainFilter, String projectFilter, Boolean orgFilter);

	public ArtifactsDTO getArtifactsThatBelongsTo(String artifactName);

	public ArtifactsDTO getArtifactsDerivedFrom(String artifactName);

	public ArtifactDTO updateBelongsTo(String artifactName);

	public ArtifactDTO updateDerivedFrom(String artifactName);

	public ArtifactDTO saveArtifact(ArtifactDTO artifactDTO);

	public Boolean removeArtifact(ArtifactDTO artifactDTO);

	public TypesDTO getArtifactTypes();

	ArtifactDTO alreadyExist(String artifactIdent) throws RepositoryQueryException;
	Map<String, SimpleArtifactDescriptorDTO[]> getArtifactsForSelectedActivity(String identActivity);
}
