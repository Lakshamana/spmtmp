package br.ufpa.labes.spm.domain;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A ResourceType.
 */
@Entity
@Table(name = "resource_type")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ResourceType extends Type implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "theResourceType")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<RequiredResource> theRequiredResources = new HashSet<>();

    @OneToMany(mappedBy = "resourceTypeRequired")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ResourceInstSug> theResourceInstSugs = new HashSet<>();

    @OneToMany(mappedBy = "theResourceType")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Resource> theResources = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<RequiredResource> getTheRequiredResources() {
        return theRequiredResources;
    }

    public ResourceType theRequiredResources(Set<RequiredResource> requiredResources) {
        this.theRequiredResources = requiredResources;
        return this;
    }

    public ResourceType addTheRequiredResource(RequiredResource requiredResource) {
        this.theRequiredResources.add(requiredResource);
        requiredResource.setTheResourceType(this);
        return this;
    }

    public ResourceType removeTheRequiredResource(RequiredResource requiredResource) {
        this.theRequiredResources.remove(requiredResource);
        requiredResource.setTheResourceType(null);
        return this;
    }

    public void setTheRequiredResources(Set<RequiredResource> requiredResources) {
        this.theRequiredResources = requiredResources;
    }

    public Set<ResourceInstSug> getTheResourceInstSugs() {
        return theResourceInstSugs;
    }

    public ResourceType theResourceInstSugs(Set<ResourceInstSug> resourceInstSugs) {
        this.theResourceInstSugs = resourceInstSugs;
        return this;
    }

    public ResourceType addTheResourceInstSug(ResourceInstSug resourceInstSug) {
        this.theResourceInstSugs.add(resourceInstSug);
        resourceInstSug.setResourceTypeRequired(this);
        return this;
    }

    public ResourceType removeTheResourceInstSug(ResourceInstSug resourceInstSug) {
        this.theResourceInstSugs.remove(resourceInstSug);
        resourceInstSug.setResourceTypeRequired(null);
        return this;
    }

    public void setTheResourceInstSugs(Set<ResourceInstSug> resourceInstSugs) {
        this.theResourceInstSugs = resourceInstSugs;
    }

    public Set<Resource> getTheResources() {
        return theResources;
    }

    public ResourceType theResources(Set<Resource> resources) {
        this.theResources = resources;
        return this;
    }

    public ResourceType addTheResource(Resource resource) {
        this.theResources.add(resource);
        resource.setTheResourceType(this);
        return this;
    }

    public ResourceType removeTheResource(Resource resource) {
        this.theResources.remove(resource);
        resource.setTheResourceType(null);
        return this;
    }

    public void setTheResources(Set<Resource> resources) {
        this.theResources = resources;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceType)) {
            return false;
        }
        return id != null && id.equals(((ResourceType) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "ResourceType{" +
            "id=" + getId() +
            "}";
    }
}
