package br.ufpa.labes.spm.repository.interfaces.artifacts;

import java.util.List;

import javax.persistence.EntityManager;

import br.ufpa.labes.spm.domain.Artifact;
import br.ufpa.labes.spm.repository.interfaces.BaseRepositoryQuery;
import br.ufpa.labes.spm.service.dto.SimpleArtifactDescriptorDTO;
import br.ufpa.labes.spm.util.PagingContext;
import br.ufpa.labes.spm.util.SortCriteria;

public interface ArtifactRepositoryQuery {

  public Artifact update(Artifact object);

  public Artifact retrieve(String key);

  public List<Artifact> retrieveByCriteria(Artifact searchCriteria);

  public List<Artifact> retrieveByCriteria(Artifact searchCriteria, SortCriteria sortCriteria);

  public List<Artifact> retrieveByCriteria(
      Artifact searchCriteria, SortCriteria sortCriteria, PagingContext paging);

  public Artifact retrieveBySecondaryKey(String ident);

  public String generateIdent(String oldIdent);

  public String generateIdent(String oldIdent, Artifact t);

  public Class<Artifact> getBusinessClass();

  public EntityManager getPersistenceContext();

  public Object[] getArtifactsIdentsFromProcessModelWithoutTemplates(String ident);

  public Artifact getByName(String name);

  public SimpleArtifactDescriptorDTO[] getInputArtifactsForNormal(String normalIdent);

  public SimpleArtifactDescriptorDTO[] getOutputArtifactsForNormal(String identActivity);
}
