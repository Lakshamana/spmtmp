package br.ufpa.labes.spm.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A ReqAgent.
 */
@Entity
@Table(name = "req_agent")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReqAgent extends RequiredPeople implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties("theReqAgents")
    private Agent theAgent;

    @ManyToOne
    @JsonIgnoreProperties("theReqAgents")
    private Role theRole;

    @OneToMany(mappedBy = "theReqAgent")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ReqAgentRequiresAbility> theReqAgentRequiresAbilities = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Agent getTheAgent() {
        return theAgent;
    }

    public ReqAgent theAgent(Agent agent) {
        this.theAgent = agent;
        return this;
    }

    public void setTheAgent(Agent agent) {
        this.theAgent = agent;
    }

    public Role getTheRole() {
        return theRole;
    }

    public ReqAgent theRole(Role role) {
        this.theRole = role;
        return this;
    }

    public void setTheRole(Role role) {
        this.theRole = role;
    }

    public Set<ReqAgentRequiresAbility> getTheReqAgentRequiresAbilities() {
        return theReqAgentRequiresAbilities;
    }

    public ReqAgent theReqAgentRequiresAbilities(Set<ReqAgentRequiresAbility> reqAgentRequiresAbilities) {
        this.theReqAgentRequiresAbilities = reqAgentRequiresAbilities;
        return this;
    }

    public ReqAgent addTheReqAgentRequiresAbility(ReqAgentRequiresAbility reqAgentRequiresAbility) {
        this.theReqAgentRequiresAbilities.add(reqAgentRequiresAbility);
        reqAgentRequiresAbility.setTheReqAgent(this);
        return this;
    }

    public ReqAgent removeTheReqAgentRequiresAbility(ReqAgentRequiresAbility reqAgentRequiresAbility) {
        this.theReqAgentRequiresAbilities.remove(reqAgentRequiresAbility);
        reqAgentRequiresAbility.setTheReqAgent(null);
        return this;
    }

    public void setTheReqAgentRequiresAbilities(Set<ReqAgentRequiresAbility> reqAgentRequiresAbilities) {
        this.theReqAgentRequiresAbilities = reqAgentRequiresAbilities;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReqAgent)) {
            return false;
        }
        return id != null && id.equals(((ReqAgent) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "ReqAgent{" +
            "id=" + getId() +
            "}";
    }

    public void removeFromTheRole(){
      if (this.theRole!=null){
        this.theRole.removeTheReqAgent(this);
      }
    }

    public void insertIntoTheRole(Role theRole){
      theRole.addTheReqAgent(this);
    }

    public void removeFromTheAgent(){
      if (this.theAgent!=null){
        this.theAgent.removeTheReqAgent(this);
      }
    }

    public void insertIntoTheAgent(Agent theAgent){
      theAgent.addTheReqAgent(this);
    }


}
