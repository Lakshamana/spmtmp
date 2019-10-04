package br.ufpa.labes.spm.service.dto;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link br.ufpa.labes.spm.domain.ArtifactEstimation} entity.
 */
public class ArtifactEstimationDTO implements Serializable {

    private Long id;


    private Long artifactId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(Long artifactId) {
        this.artifactId = artifactId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ArtifactEstimationDTO artifactEstimationDTO = (ArtifactEstimationDTO) o;
        if (artifactEstimationDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), artifactEstimationDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ArtifactEstimationDTO{" +
            "id=" + getId() +
            ", artifact=" + getArtifactId() +
            "}";
    }
}
