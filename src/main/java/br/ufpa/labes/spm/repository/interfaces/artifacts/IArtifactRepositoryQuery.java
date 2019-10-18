package br.ufpa.labes.spm.repository.interfaces.artifacts;

import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.service.dto.SimpleArtifactDescriptorDTO;
import br.ufpa.labes.spm.domain.Artifact;

public interface IArtifactRepositoryQuery extends BaseRepositoryQuery<Artifact, Long> {

  public Object[] getArtifactsIdentsFromProcessModelWithoutTemplates(String ident);

  public Artifact getByName(String name);

  public SimpleArtifactDescriptorDTO[] getInputArtifactsForNormal(String normalIdent);

  public SimpleArtifactDescriptorDTO[] getOutputArtifactsForNormal(String identActivity);
}
