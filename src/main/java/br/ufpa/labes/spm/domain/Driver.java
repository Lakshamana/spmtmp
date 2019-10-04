package br.ufpa.labes.spm.domain;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

/**
 * A Driver.
 */
@Entity
@Table(name = "driver")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Driver implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "app_key")
    private String appKey;

    @Column(name = "app_secret")
    private String appSecret;

    @Column(name = "app_key_google")
    private String appKeyGoogle;

    @Column(name = "app_secret_google")
    private String appSecretGoogle;

    @Column(name = "request_url")
    private String requestUrl;

    @OneToOne
    @JoinColumn(unique = true)
    private Plugin thePlugin;

    @OneToOne
    @JoinColumn(unique = true)
    private Company company;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public Driver tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAppKey() {
        return appKey;
    }

    public Driver appKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public Driver appSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getAppKeyGoogle() {
        return appKeyGoogle;
    }

    public Driver appKeyGoogle(String appKeyGoogle) {
        this.appKeyGoogle = appKeyGoogle;
        return this;
    }

    public void setAppKeyGoogle(String appKeyGoogle) {
        this.appKeyGoogle = appKeyGoogle;
    }

    public String getAppSecretGoogle() {
        return appSecretGoogle;
    }

    public Driver appSecretGoogle(String appSecretGoogle) {
        this.appSecretGoogle = appSecretGoogle;
        return this;
    }

    public void setAppSecretGoogle(String appSecretGoogle) {
        this.appSecretGoogle = appSecretGoogle;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public Driver requestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
        return this;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public Plugin getThePlugin() {
        return thePlugin;
    }

    public Driver thePlugin(Plugin plugin) {
        this.thePlugin = plugin;
        return this;
    }

    public void setThePlugin(Plugin plugin) {
        this.thePlugin = plugin;
    }

    public Company getCompany() {
        return company;
    }

    public Driver company(Company company) {
        this.company = company;
        return this;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Driver)) {
            return false;
        }
        return id != null && id.equals(((Driver) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Driver{" +
            "id=" + getId() +
            ", tipo='" + getTipo() + "'" +
            ", appKey='" + getAppKey() + "'" +
            ", appSecret='" + getAppSecret() + "'" +
            ", appKeyGoogle='" + getAppKeyGoogle() + "'" +
            ", appSecretGoogle='" + getAppSecretGoogle() + "'" +
            ", requestUrl='" + getRequestUrl() + "'" +
            "}";
    }
}
