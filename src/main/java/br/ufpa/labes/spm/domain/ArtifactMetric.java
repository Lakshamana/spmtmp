package br.ufpa.labes.spm.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

/**
 * A ArtifactMetric.
 */
@Entity
@Table(name = "artifact_metric")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ArtifactMetric extends Metric implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties("theArtifactMetrics")
    private Artifact artifact;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Artifact getArtifact() {
        return artifact;
    }

    public ArtifactMetric artifact(Artifact artifact) {
        this.artifact = artifact;
        return this;
    }

    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArtifactMetric)) {
            return false;
        }
        return id != null && id.equals(((ArtifactMetric) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "ArtifactMetric{" +
            "id=" + getId() +
            "}";
    }
}
