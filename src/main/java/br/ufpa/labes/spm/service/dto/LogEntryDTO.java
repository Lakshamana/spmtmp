package br.ufpa.labes.spm.service.dto;
import java.time.LocalDate;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link br.ufpa.labes.spm.domain.LogEntry} entity.
 */
public class LogEntryDTO implements Serializable {

    private Long id;

    private LocalDate date;

    private String operation;

    private String className;

    private String uid;


    private Long userId;

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

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        LogEntryDTO logEntryDTO = (LogEntryDTO) o;
        if (logEntryDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), logEntryDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "LogEntryDTO{" +
            "id=" + getId() +
            ", date='" + getDate() + "'" +
            ", operation='" + getOperation() + "'" +
            ", className='" + getClassName() + "'" +
            ", uid='" + getUid() + "'" +
            ", user=" + getUserId() +
            "}";
    }
}
