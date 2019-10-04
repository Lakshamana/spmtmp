package br.ufpa.labes.spm.domain;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Type.
 */
@Entity
@Table(name = "type")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Inheritance(strategy=InheritanceType.JOINED)
public class Type implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ident")
    private String ident;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "user_defined")
    private Boolean userDefined;

    @ManyToOne
    @JsonIgnoreProperties("subTypes")
    private Type superType;

    @OneToMany(mappedBy = "superType")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Type> subTypes = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdent() {
        return ident;
    }

    public Type ident(String ident) {
        this.ident = ident;
        return this;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getDescription() {
        return description;
    }

    public Type description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isUserDefined() {
        return userDefined;
    }

    public Type userDefined(Boolean userDefined) {
        this.userDefined = userDefined;
        return this;
    }

    public void setUserDefined(Boolean userDefined) {
        this.userDefined = userDefined;
    }

    public Type getSuperType() {
        return superType;
    }

    public Type superType(Type type) {
        this.superType = type;
        return this;
    }

    public void setSuperType(Type type) {
        this.superType = type;
    }

    public Set<Type> getSubTypes() {
        return subTypes;
    }

    public Type subTypes(Set<Type> types) {
        this.subTypes = types;
        return this;
    }

    public Type addSubType(Type type) {
        this.subTypes.add(type);
        type.setSuperType(this);
        return this;
    }

    public Type removeSubType(Type type) {
        this.subTypes.remove(type);
        type.setSuperType(null);
        return this;
    }

    public void setSubTypes(Set<Type> types) {
        this.subTypes = types;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Type)) {
            return false;
        }
        return id != null && id.equals(((Type) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Type{" +
            "id=" + getId() +
            ", ident='" + getIdent() + "'" +
            ", description='" + getDescription() + "'" +
            ", userDefined='" + isUserDefined() + "'" +
            "}";
    }
}
