package br.ufpa.labes.spm.web.rest;

import br.ufpa.labes.spm.domain.ResourceType;
import br.ufpa.labes.spm.repository.interfaces.GenericRepository;
import br.ufpa.labes.spm.repository.ResourceTypeRepository;
import br.ufpa.labes.spm.web.rest.errors.BadRequestAlertException;

import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link br.ufpa.labes.spm.domain.ResourceType}.
 */
@RestController
@RequestMapping("/api")
public class ResourceTypeResource {

    private final Logger log = LoggerFactory.getLogger(ResourceTypeResource.class);

    private static final String ENTITY_NAME = "resourceType";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final ResourceTypeRepository resourceTypeRepository;

    public ResourceTypeResource(ResourceTypeRepository resourceTypeRepository) {
        this.resourceTypeRepository = resourceTypeRepository;
    }

    /**
     * {@code POST  /resource-types} : Create a new resourceType.
     *
     * @param resourceType the resourceType to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new resourceType, or with status {@code 400 (Bad Request)} if the resourceType has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/resource-types")
    public ResponseEntity<ResourceType> createResourceType(@RequestBody ResourceType resourceType) throws URISyntaxException {
        log.debug("REST request to save ResourceType : {}", resourceType);
        if (resourceType.getId() != null) {
            throw new BadRequestAlertException("A new resourceType cannot already have an ID", ENTITY_NAME, "idexists");
        }
        ResourceType result = resourceTypeRepository.save(resourceType);
        return ResponseEntity.created(new URI("/api/resource-types/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /resource-types} : Updates an existing resourceType.
     *
     * @param resourceType the resourceType to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated resourceType,
     * or with status {@code 400 (Bad Request)} if the resourceType is not valid,
     * or with status {@code 500 (Internal Server Error)} if the resourceType couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/resource-types")
    public ResponseEntity<ResourceType> updateResourceType(@RequestBody ResourceType resourceType) throws URISyntaxException {
        log.debug("REST request to update ResourceType : {}", resourceType);
        if (resourceType.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        ResourceType result = resourceTypeRepository.save(resourceType);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, resourceType.getId().toString()))
            .body(result);
    }

    /**
     * {@code GET  /resource-types} : get all the resourceTypes.
     *

     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of resourceTypes in body.
     */
    @GetMapping("/resource-types")
    public List<ResourceType> getAllResourceTypes() {
        log.debug("REST request to get all ResourceTypes");
        return resourceTypeRepository.findAll();
    }

    /**
     * {@code GET  /resource-types/:id} : get the "id" resourceType.
     *
     * @param id the id of the resourceType to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the resourceType, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/resource-types/{id}")
    public ResponseEntity<ResourceType> getResourceType(@PathVariable Long id) {
        log.debug("REST request to get ResourceType : {}", id);
        Optional<ResourceType> resourceType = resourceTypeRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(resourceType);
    }

    /**
     * {@code DELETE  /resource-types/:id} : delete the "id" resourceType.
     *
     * @param id the id of the resourceType to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/resource-types/{id}")
    public ResponseEntity<Void> deleteResourceType(@PathVariable Long id) {
        log.debug("REST request to delete ResourceType : {}", id);
        resourceTypeRepository.deleteById(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString())).build();
    }
}
