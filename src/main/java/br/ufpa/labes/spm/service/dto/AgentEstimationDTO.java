package br.ufpa.labes.spm.service.dto;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link br.ufpa.labes.spm.domain.AgentEstimation} entity.
 */
public class AgentEstimationDTO implements Serializable {

    private Long id;


    private Long agentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AgentEstimationDTO agentEstimationDTO = (AgentEstimationDTO) o;
        if (agentEstimationDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), agentEstimationDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AgentEstimationDTO{" +
            "id=" + getId() +
            ", agent=" + getAgentId() +
            "}";
    }
}
