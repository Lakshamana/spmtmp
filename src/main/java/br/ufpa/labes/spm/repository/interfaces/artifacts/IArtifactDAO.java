package br.ufpa.labes.spm.repository.interfaces.artifacts;

import br.ufpa.labes.spm.repository.interfaces.BaseDAO;
import br.ufpa.labes.spm.service.dto.SimpleArtifactDescriptorDTO;
import br.ufpa.labes.spm.domain.Artifact;

public interface IArtifactDAO extends BaseDAO<Artifact, Long> {

  public Object[] getArtifactsIdentsFromProcessModelWithoutTemplates(String ident);

  public Artifact getByName(String name);

  public SimpleArtifactDescriptorDTO[] getInputArtifactsForNormal(String normalIdent);

  public SimpleArtifactDescriptorDTO[] getOutputArtifactsForNormal(String identActivity);
}
