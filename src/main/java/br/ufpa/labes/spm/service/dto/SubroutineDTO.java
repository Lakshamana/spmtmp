package br.ufpa.labes.spm.service.dto;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link br.ufpa.labes.spm.domain.Subroutine} entity.
 */
public class SubroutineDTO implements Serializable {

    private Long id;


    private Long theArtifactTypeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTheArtifactTypeId() {
        return theArtifactTypeId;
    }

    public void setTheArtifactTypeId(Long artifactTypeId) {
        this.theArtifactTypeId = artifactTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SubroutineDTO subroutineDTO = (SubroutineDTO) o;
        if (subroutineDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), subroutineDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "SubroutineDTO{" +
            "id=" + getId() +
            ", theArtifactType=" + getTheArtifactTypeId() +
            "}";
    }
}
