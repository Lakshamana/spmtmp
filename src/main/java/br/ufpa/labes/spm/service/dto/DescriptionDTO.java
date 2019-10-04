package br.ufpa.labes.spm.service.dto;
import java.time.LocalDate;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Lob;

/**
 * A DTO for the {@link br.ufpa.labes.spm.domain.Description} entity.
 */
public class DescriptionDTO implements Serializable {

    private Long id;

    private LocalDate date;

    @Lob
    private String why;


    private Long theOldVersionId;

    private Long theNewVersionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    public Long getTheOldVersionId() {
        return theOldVersionId;
    }

    public void setTheOldVersionId(Long templateId) {
        this.theOldVersionId = templateId;
    }

    public Long getTheNewVersionId() {
        return theNewVersionId;
    }

    public void setTheNewVersionId(Long templateId) {
        this.theNewVersionId = templateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DescriptionDTO descriptionDTO = (DescriptionDTO) o;
        if (descriptionDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), descriptionDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "DescriptionDTO{" +
            "id=" + getId() +
            ", date='" + getDate() + "'" +
            ", why='" + getWhy() + "'" +
            ", theOldVersion=" + getTheOldVersionId() +
            ", theNewVersion=" + getTheNewVersionId() +
            "}";
    }
}
